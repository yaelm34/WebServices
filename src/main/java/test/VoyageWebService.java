package test;

import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService
private class VoyageWebService{

  @WebMethod
  public int reserverChambre(){

    return 1;

  }

}
