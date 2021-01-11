
import client.ChambreWebService;
import client.ChambreWebServiceImplService;

public class ChambreWebServiceClient{

  public static void main(String args[]){

    ChambreWebServiceImplService webservice = new ChambreWebServiceImplService();
    ChambreWebService service = webservice.getChambreWebServiceImplPort();

    service.creerChambres();
    System.out.println(service.afficherChambresJSON());
  }

}
