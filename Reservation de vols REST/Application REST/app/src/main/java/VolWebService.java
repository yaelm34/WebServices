package rest.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/reservationVol")
public class VolWebService{
	
  @Path("liste")	
  @GET
  @Produces("application/json")
  public String listeVols(){
	  return "{" //
              + "'date': '" + "date" + "'," //
              + "'location': '" + "test" + "'," //
              + "'info': '" + "oui" + "'" //
              + "}";
  }

}
