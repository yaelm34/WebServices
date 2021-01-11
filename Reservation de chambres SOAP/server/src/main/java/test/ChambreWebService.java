import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService(targetNamespace="http://localhost:10000/ReservationVoyage")
public interface ChambreWebService{

  @WebMethod
  String afficherChambresJSON();

  @WebMethod
  String reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom);

  @WebMethod
  void creerChambres();

  String afficherChambres();

}
