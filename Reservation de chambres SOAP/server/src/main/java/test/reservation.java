import java.util.Date;

public class reservation{

  private int numero;
  private chambre chambreReservee;
  private Date dateArrivee;
  private Date dateDepart;
  private String nom;
  private String prenom;

  public reservation(int n, chambre c, String da, String dp, String nom, String prenom){

  /*  String[] dateASplit = da.split("_");
    String[] dateDSplit = dp.split("_");

    Date dateA = new Date(Integer.parseInt(dateASplit[0]),Integer.parseInt(dateASplit[1]),Integer.parseInt(dateASplit[2]));
    Date dateD = new Date(Integer.parseInt(dateDSplit[0]),Integer.parseInt(dateDSplit[1]),Integer.parseInt(dateDSplit[2]));

    this.numero = n;
    this.chambreReservee = c;
    this.dateArrivee = dateA;
    this.dateDepart = dateD;
    this.nom = nom;*/
    this.prenom = prenom;

  }
/*
  int getNumero(){
    return this.numero;
  }

  chambre getChambre(){
    return this.chambreReservee;
  }

  Date getDateArrivee(){
    return this.dateArrivee;
  }

  Date getDateDepart(){
    return this.dateDepart;
  }

  String getNom(){
    return this.nom;
  }

  String getPrenom(){
    return this.prenom;
  }*/

}
