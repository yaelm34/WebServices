import javax.jws.WebService;

 @WebService(endpointInterface="VoyageWebService", targetNamespace="http://localhost:10000/ReservationVoyage")
 public class VoyageWebServiceImpl implements VoyageWebService {

   @Override
   public int reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom){
     return 1;
   }

 }
