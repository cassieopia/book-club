package com.cwang.bookclub.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/club")
@Produces(MediaType.APPLICATION_JSON)
public class ClubResource {

    @GET
    public String helloWorld(){

        return("Hello clubs");

    }



} 