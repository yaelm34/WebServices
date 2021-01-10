package rest.app;

import java.util.Date;

public class vol{

  private int numero;
  private String compagnie;
  private String place;
  private int prix;
  private String date;
  private boolean estReserve;

  public vol(int num, String comp, String pl, int pr, String date){

    //String[] dateDSplit = date.split("_");

    //Date dateD = new Date(Integer.parseInt(dateDSplit[0]),Integer.parseInt(dateDSplit[1]),Integer.parseInt(dateDSplit[2]));

    this.numero = num;
    this.compagnie = comp;
    this.place = pl;
    this.prix = pr;
    this.date = date;
    this.estReserve = false;

  }

  public int getNumero(){
    return this.numero;
  }

  public String getCompagnie(){
    return this.compagnie;
  }

  public String getPlace(){
    return this.place;
  }

  public int getPrix(){
    return this.prix;
  }

  public String getDate(){
    return this.date;
  }

  public boolean estReserve(){
    return this.estReserve;
  }

  public void reserver(){
    this.estReserve = true;
  }


}
