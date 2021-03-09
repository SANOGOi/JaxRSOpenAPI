package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.generic.kanban.UserDAO;
import fr.istic.taa.jaxrs.domain.Utilisateur;
import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@Produces({"application/json", "application/xml"})
public class UserResource {
    @GET
    @Path("/{userId}")
    public Utilisateur getUserById(@PathParam("userId") Integer userId)  {
        // return pet
        return new UserDAO().findOne(userId);
    }

    @POST
    @Consumes("application/json")
    public Response addUser(
            @Parameter(description = "Ajout d'un utilisateur via rest", required = true) Utilisateur user) {
        UserDAO daoUser = new UserDAO();
        daoUser.save(user);
        return Response.ok().entity("SUCCESS").build();
    }
}
