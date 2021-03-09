package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.generic.kanban.FicheDAO;
import fr.istic.taa.jaxrs.domain.Fiche;
import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/fiche")
@Produces({"application/json", "application/xml"})

public class FicheResource {
    @GET
    @Path("/{ficheId}")
    public Fiche getFicheById(@PathParam("ficheId") Integer ficheId)  {

        return new FicheDAO().findOne(ficheId);
    }

    @POST
    @Consumes("application/json")
    public Response addFIche(
            @Parameter(description = "Fiche object that needs to be added to the store", required = true) Fiche fiche) {
        new FicheDAO().save(fiche);
        return Response.ok().entity("SUCCESS").build();
    }
}
