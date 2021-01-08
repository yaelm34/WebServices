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

    dateA = new Date(dateASplit[0],dateASplit[1],dateASplit[2]);
    dateD = new Date(dateDSplit[0],dateDSplit[1],dateDSplit[2]);

    this.numero = n;
    this.chambre = c;
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
    return this.chambre;
  }

  String getDateArrivee(){
    return this.dateArrivee;
  }

  String getDateDepart(){
    return this.dateDepart;
  }

  String getNom(){
    return this.nom;
  }

  String getPrenom(){
    return this.prenom;
  }*/

}
