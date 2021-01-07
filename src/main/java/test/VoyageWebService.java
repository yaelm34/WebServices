import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService(targetNamespace="http://localhost:10000/ReservationVoyage")
public interface VoyageWebService{

  @WebMethod
  int reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom);


}
