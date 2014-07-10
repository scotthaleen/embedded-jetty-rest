package com.embedded;

import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.activation.MimetypesFileTypeMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class Index {
    @GET
    @Produces("text/html")
    public Response  index() throws URISyntaxException {
        File f = new File(System.getProperty("user.dir")+"/index.html");
        String mt = new MimetypesFileTypeMap().getContentType(f);
        return Response.ok(f, mt).build();
    }
    @GET
    @Path("/echo/{msg}")
    public Response  echoGet(@PathParam("msg") String msg) {
        return Response.status(200).entity("GET Echo: " + msg).build();
    }

    @POST
    @Path("/echo")
    @Consumes("application/json")
    public Response echoPost(Map<String, String> postBody){
        String sz = postBody.get("test");
        return Response.status(200).entity("POST Echo: " + sz).build();
    }
}
