import javax.xml.ws.Endpoint;

 public class VoyageWebServicePublisher {

   public static void main(String[] args){

     VoyageWebServiceImpl inst = new VoyageWebServiceImpl();

     Endpoint ep = Endpoint.create(inst);

     ep.publish("http://localhost:10000/ReservationVoyage");

   }

 }
