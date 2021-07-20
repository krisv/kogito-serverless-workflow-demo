package org.kie.kogito.thegame.employee;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Employee Service",
        version = "1.0.0"
    ),
    servers = {
        @Server( url = "http://localhost:8082" )
    }
)
public class EmployeeApplication extends Application {
    
}
