package org.kie.kogito.thegame.scores;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("/scores")
public class ScoresService {
	
	private long count = 0L;
	private Random random = new Random();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(operationId = "countWinners")
    public long count() {
        return count;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(operationId = "isWinner")
    public ScoreResult put() {
    	int number = random.nextInt(10);
		if (number == 9) {
			count++;
			return new ScoreResult(true);
		}
    	return new ScoreResult(false);
    }

}