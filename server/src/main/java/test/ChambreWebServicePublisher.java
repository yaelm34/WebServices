import javax.xml.ws.Endpoint;

 public class ChambreWebServicePublisher {

   public static void main(String[] args){

     ChambreWebServiceImpl service = new ChambreWebServiceImpl();

     service.creerChambres();
     service.afficherChambres(); //test

     Endpoint ep = Endpoint.create(service);

     ep.publish("http://localhost:10000/ReservationVoyage");

   }

 }
