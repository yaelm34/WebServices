import javax.jws.WebService;
import java.lang.Math;
import java.util.Date;
import java.util.Random;

 @WebService(endpointInterface="ChambreWebService", targetNamespace="http://localhost:10000/ReservationVoyage")
 public class ChambreWebServiceImpl implements ChambreWebService {

   private chambre[] chambres = new chambre[100];
   public reservation[] reservations = new reservation[1000];

   chambre[] getChambres(){

     return this.chambres;
   }

   reservation[] getReservations(){

     return this.reservations;
   }

   @Override
   public String afficherChambresJSON(){
     String list = "[";

     for(int i=1; i<100; i++){

       list +="{\"numero_chambre\":\"" + chambres[i].getNumero() + "\"," + "{\"type\":\"" + chambres[i].getType() + "\"," + "{\"prix\":\"" + chambres[i].getPrix() + "\"}";
       if(i!=99){
         list +=",";
       }
     }

     list+="]";
     System.out.println(list);
     return list;

   }


   @Override
   public String reserverChambre(int numeroChambre, String dateA, String dateD, String nom, String prenom){

     return "ok: " + numeroChambre ;
   }

   @Override
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

      String[] dateASplit = dateA.split("_");
      String[] dateDSplit = dateD.split("_");
      //chambre chambreReservee = new chambre();
      //boolean dispo = false;

      Date dateAr = new Date(Integer.parseInt(dateASplit[0]),Integer.parseInt(dateASplit[1]),Integer.parseInt(dateASplit[2]));
      Date dateDe = new Date(Integer.parseInt(dateDSplit[0]),Integer.parseInt(dateDSplit[1]),Integer.parseInt(dateDSplit[2]));

      /*for(int i=0;i<1002;i++){

        //System.out.println("Num Chambre Reservee " + chambreReservee.getNumero());

        if (this.getReservations()[i].getChambre().getNumero() == c.getNumero())
        {
          if ( ( dateDe.before( this.getReservations()[i].getDateArrivee()) && ( dateAr.before( this.getReservations()[i].getDateArrivee()) || dateDe.equals( this.getReservations()[i].getDateArrivee()) ) ) && ( ( dateDe.after( this.getReservations()[i].getDateDepart()) && ( dateAr.after( this.getReservations()[i].getDateDepart()) || dateAr.equals( this.getReservations()[i].getDateDepart()) ) )))
          {
            dispo = true;
          }
          else{
            dispo = false;
          }
        }



      }*/

      Random dispo = new Random();
      return dispo.nextBoolean();
    }


}
