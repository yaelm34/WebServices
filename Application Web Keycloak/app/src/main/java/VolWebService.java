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
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.Response;
import javax.servlet.*;

import com.sun.xml.*;
import java.net.*;
import com.sun.xml.ws.util.xml.XmlUtil;
import javax.xml.parsers.*;



import clientSOAP.ChambreWebServiceClient;

@Path("/reservationVol")
@Provider
public class VolWebService{
	
  @Path("liste")	
  @GET
  @Produces("application/xml")
  public String listeVols(){
	  
	  String res = "<liste_vols>";
	  
	  vol v1 = new vol(2132,"Air France","3C",155,"2021_01_09");
	  vol v2 = new vol(6097,"Air France","1B",70,"2021_01_12");
	  vol v3 = new vol(5038,"British Airlines","6G",146,"2021_01_12");
	  vol v4 = new vol(4368,"KLM","5D",100,"2021_01_16");
	  vol v5 = new vol(1546,"Volotea","1A",70,"2021_01_19");
	  
	  vol[] vols= {v1,v2,v3,v4,v5};
	  
	  for(int i=0;i<5;i++) {
		  res+="<vol>" //
				  +"<compagnie>" + vols[i].getCompagnie() + "</compagnie>" //
				  +"<numvol>" + vols[i].getNumero() + "</numvol>" //
				  +"<place>" + vols[i].getPlace() + "</place>" //
				  +"<date>" + vols[i].getDate() + "</date>" //
				+"</vol>";
	  }
	  
	  res+="</liste_vols>";
	  
	  return res;
  }
  
  @Path("liste_vols_json")	
  @GET
  @Produces("application/json")
  public Response listeVolsJSON(){
	  
	  String res = "[";
	  
	  vol v1 = new vol(2132,"Air France","3C",155,"2021_01_09");
	  vol v2 = new vol(6097,"Air France","1B",70,"2021_01_12");
	  vol v3 = new vol(5038,"British Airlines","6G",146,"2021_01_12");
	  vol v4 = new vol(4368,"KLM","5D",100,"2021_01_16");
	  vol v5 = new vol(1546,"Volotea","1A",70,"2021_01_19");
	  
	  vol[] vols= {v1,v2,v3,v4,v5};
	  
	  for(int i=0;i<5;i++) {
		  res+="{" //
				  +"\"compagnie\":\"" + vols[i].getCompagnie() + "\"," //
				  +"\"numvol\":\"" + vols[i].getNumero() + "\"," //
				  +"\"place\":\"" + vols[i].getPlace() + "\"," //
				  +"\"date\":\"" + vols[i].getDate() + "\"";
		  
		  if(i==4) {
			  res+="}";
		  }else {
			  res+="},";
		  }
	  }
	  
	  res+="]";
	  
	 return Response.ok(res).header("Access-Control-Allow-Origin", "*").build();

  }
  
  @Path("liste_hotels")	
  @GET
  @Produces("application/xml")
  public String listeHotels(){
	  	
	  ChambreWebServiceClient client = new ChambreWebServiceClient();
	  
	  //ChambreWebServiceImplService webservice = new ChambreWebServiceImplService();
	  //ChambreWebService service = webservice.getChambreWebServiceImplPort();

	  String res = "<liste_hotels><hotel><numero>" + client.result() +"</numero></hotel></liste_hotels>";

	  return res;
  }

}
