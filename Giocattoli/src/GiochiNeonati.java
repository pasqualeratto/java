public class GiochiNeonati extends Giocattoli{
  private String materiale;
  
  public GiochiNeonati(String codice,String nome,float prezzo,String materiale){
  super(codice,nome,prezzo);
  this.materiale=materiale;

}
public void setMateriale(String materiale){this.materiale=materiale;}
public String getMateriale(){return this.materiale;}

}