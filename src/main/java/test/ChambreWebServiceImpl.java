import javax.jws.WebService;
import java.lang.Math;
import java.util.Date;

 @WebService(endpointInterface="ChambreWebService", targetNamespace="http://localhost:10000/ReservationVoyage")
 public class ChambreWebServiceImpl implements ChambreWebService {

   private chambre[] chambres = new chambre[100];
   private reservartion[] reservations = new reservation[1000];

   @Override
   public String reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom){

     return "ok";
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

      for(int i=1; i<100; i++){

        list +="Chambre N°" + chambres[i].getNumero() + " de type " + chambres[i].getType() + " à " + chambres[i].getPrix() + "€" + "\n";

      }

      System.out.println(list);
      return list;

    }

    public boolean verifierDispo(chambre c, String dateA, String dateD){

      for(int i=0;i<1001;i++){

        String[] dateASplit = dateA.split("_");
        String[] dateDSplit = dateD.split("_");

        dateA = new Date(dateASplit[0],dateASplit[1],dateASplit[2]);
        dateA = new Date(dateDSplit[0],dateDSplit[1],dateDSplit[2]);

        chambre chambreReservee = this.reservations[i].chambreReservee;

        //todo
      }


    }

 }
