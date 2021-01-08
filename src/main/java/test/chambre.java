public class chambre{

  private int numero;
  private String type; //bas de gamme, milieu de gamme, hdg
  private float prix;

  public chambre(int n, String type, float prix){

    this.numero = n;
    this.type = type;
    this.prix=prix;

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


}
