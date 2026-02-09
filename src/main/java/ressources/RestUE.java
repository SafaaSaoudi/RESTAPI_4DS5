package ressources;

import entities.UniteEnseignement;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("UE")
public class RestUE {

    UniteEnseignementBusiness UEB = new UniteEnseignementBusiness();

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response createUE(UniteEnseignement ue){
      if( UEB.addUniteEnseignement(ue)){
          return Response.status(Response.Status.CREATED).build();}
      else {
          return Response.status(Response.Status.NOT_FOUND).build();
      }
    }

}
