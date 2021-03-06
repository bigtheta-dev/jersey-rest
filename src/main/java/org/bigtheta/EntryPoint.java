package org.bigtheta;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class EntryPoint {

    @GET
    @Path("")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "try http://localhost:8080/hello";
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}