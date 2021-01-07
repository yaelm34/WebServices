import javax.jws.WebService;
import java.lang.Math;

 @WebService(endpointInterface="ChambreWebService", targetNamespace="http://localhost:10000/ReservationVoyage")
 public class ChambreWebServiceImpl implements ChambreWebService {

   private chambre[] chambres = new chambre[100];

   @Override
   public int reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom){
     return 1;
   }


    public void creerChambres(){

        chambre new_chambre;
        int prix;
        String gamme = "";

        for(int i=1; i<100; i++){
          prix = (int)(Math.random() * (350 - 55)) + 55;
          gamme = "Haut de gamme";

          if(prix<100){
            gamme="Bas de gamme";
          }else if(prix>100 && prix<250){
            gamme="Milieu de gamme";
          }

          new_chambre = new chambre(i,gamme,prix);
          this.chambres[i]=new_chambre;

        }

    }

    
    public String afficherChambres(){

      String list = "";
      String etat= " (DISPONIBLE)";

      for(int i=1; i<100; i++){

        if(chambres[i].estReservee()){
            etat=" (RESERVEE!)";
        }

        list +="Chambre N°" + chambres[i].getNumero() + " de type " + chambres[i].getType() + " à " + chambres[i].getPrix() + "€" + etat + "\n";

      }

      System.out.println(list);
      return list;

    }

 }
