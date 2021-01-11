package clientSOAP;

//import clientSOAP.ChambreWebService;
//import clientSOAP.ChambreWebServiceImplService;

public class ChambreWebServiceClient{
	
	private ChambreWebServiceImplService webservice;
	private ChambreWebService service;
  
  public String result() {
	  
	 this.webservice = new ChambreWebServiceImplService();
	 this.service = this.webservice.getChambreWebServiceImplPort();

	 System.out.println(this.service.reserverChambre(16,"","","",""));
	 return this.service.reserverChambre(16,"","","","");
  }

}
