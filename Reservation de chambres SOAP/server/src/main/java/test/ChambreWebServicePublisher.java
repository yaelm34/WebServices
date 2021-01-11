import javax.xml.ws.Endpoint;
import java.util.Date;

 public class ChambreWebServicePublisher {

   public static void main(String[] args){

     ChambreWebServiceImpl service = new ChambreWebServiceImpl();
/*
     service.creerChambres();
     service.afficherChambres(); //test
     chambre c = service.getChambres()[1];
     String dateA = "08_01_2021";
     String dateD = "11_01_2021";*/

  //   String[] dateASplit = dateA.split("_");
//     String[] dateDSplit = dateD.split("_");

  /*   Date dateAr = new Date(Integer.parseInt(dateASplit[0]),Integer.parseInt(dateASplit[1]),Integer.parseInt(dateASplit[2]));
     Date dateDe = new Date(Integer.parseInt(dateDSplit[0]),Integer.parseInt(dateDSplit[1]),Integer.parseInt(dateDSplit[2]));
     String nom = "Misseri";
     String prenom = "Yael";
     reservation r =  new reservation(0, c, dateA, dateD, nom, prenom);
     service.reservations[0] = r;
     System.out.println(r.getNom());
     System.out.println(c.getNumero());*/

    // System.out.println("La chambre C est reservée : " +  service.verifierDispo(c,dateA, dateD) );

     Endpoint ep = Endpoint.create(service);

     ep.publish("http://localhost:10000/ReservationVoyage");

   }

 }
