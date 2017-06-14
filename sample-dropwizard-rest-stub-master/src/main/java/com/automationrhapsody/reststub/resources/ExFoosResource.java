/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.automationrhapsody.reststub.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/ex/foos")
public class ExFoosResource {

    @GET
    @Produces("application/json")
    public Response getFoosAsJsonFromREST() {
        //TODO: implement
        return null;
    }

}