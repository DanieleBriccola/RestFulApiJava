/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Application;
/**
 *
 * @author danie
 */
@ApplicationPath("/app")
@Path("")
public class Controllore extends Application {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public Response getMethod(@PathParam("name") String name){
        if(name == null){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        
        return Response.ok().entity("Ciao" + name).build(); 
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("{name}")
    public void postMethod(String name,String cognome,Long id){
        
        
    }
    
}
