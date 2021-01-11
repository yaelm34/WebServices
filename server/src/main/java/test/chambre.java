public class chambre{

  private int numero;
  private String type; //bas de gamme, milieu de gamme, hdg
  private float prix;
  private boolean estReservee;

  public chambre(int n, String type, float prix){

    this.numero = n;
    this.estReservee = false;
    this.type = type;
    this.prix=prix;

  }

  public chambre(){}

  void setReservee(boolean r){
    this.estReservee=r;
  }

  int getNumero(){
    return this.numero;
  }

  String getType(){
    return this.type;
  }

  float getPrix(){
    return this.prix;
  }

  boolean estReservee(){
    return this.estReservee;
  }

}
