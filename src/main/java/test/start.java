package test;
import javax.xml.ws.Endpoint;

public class start{

  public static void main(String[] args){
        Endpoint.publish("http://localhost:1234/voyages", new VoyageWebService());
  }
}
