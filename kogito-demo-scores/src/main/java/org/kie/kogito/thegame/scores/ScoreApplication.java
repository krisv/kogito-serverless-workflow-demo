package org.kie.kogito.thegame.scores;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Score Service",
        version = "1.0.0"
    ),
    servers = {
        @Server( url = "http://localhost:8081" )
    }
)
public class ScoreApplication extends Application {
    
}
