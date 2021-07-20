package org.kie.kogito.thegame.employee;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("/employee")
public class EmployeeService {

	private static Map<String, EmployeeResult> employees;

    static {
        employees = new HashMap<String, EmployeeResult>();
        employees.put("krisv", new EmployeeResult("Kris", "Verlaenen", "Castle 12, Belgium"));
    }

    @Path("/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(operationId = "getEmployeeDetails")
    public EmployeeResult getEmployeeDetails(@PathParam("name") String name) {
        EmployeeResult result = employees.get(name);
        if (result != null) {
            return result;
        }
        return new EmployeeResult("Unknown", "Unknown", "Unknown");
    }

}