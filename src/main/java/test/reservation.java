public class reservation{

  private int numero;
  private chambre chambreReservee;
  private String dateArrivee;
  private String dateDepart;
  private String nom;
  private String prenom;

  public reservation(int n, chambre c, String da, String dp, String nom, Strig prenom){

    this.numero = n;
    this.chambre = c;
    this.dateArrivee = da;
    this.dateDepart = dp;
    this.nom = nom;
    this.prenom = prenom;

  }

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
  }

}
