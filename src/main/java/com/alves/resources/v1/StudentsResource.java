package com.alves.resources.v1;

import com.alves.repository.StudentsRepository;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("api/v1/students")
public class StudentsResource{

    private StudentsRepository studentsRepository;

    public StudentsResource(final StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

   @GET
   @Path("/list") 
   public Response list(){
       return Response.status(Response.Status.FOUND).entity(studentsRepository.listAll()).build();
   }


}
