# kogito-demo-scores project

Simple service that decides if a user has won or not.  This is set to a 1 in 10 chance by default but could easily be updated.  It also keeps track of how many people already won a prize.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

It runs locally on port 8081.

Open up http://localhost:8081 to get a web page that shows number of prizes won.

## Building an image

This is meant to produce a knative image, to be pushed to quay.io/krisv/kogito-demo-scores:1.0-SNAPSHOT.  Update application.properties if you want to use your own repository.

To build your image, run:
```
./mvnw package -Dquarkus.container-image.build=true
```
You can push your image using:
```
docker push quay.io/krisv/kogito-demo-scores:1.0-SNAPSHOT
```