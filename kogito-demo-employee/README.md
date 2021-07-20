# kogito-demo-employee project

Simple service that returns address information about users.  Note that it currently only contains information for user 'krisv' but you're free to extend it with more ;)

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

It runs locally on port 8082

## Building an image

This is meant to produce a knative image, to be pushed to quay.io/krisv/kogito-demo-employee:1.0-SNAPSHOT.  Update application.properties if you want to use your own repository.

To build your image, run:
```
./mvnw package -Dquarkus.container-image.build=true
```
You can push your image using:
```
docker push quay.io/krisv/kogito-demo-employee:1.0-SNAPSHOT
```
