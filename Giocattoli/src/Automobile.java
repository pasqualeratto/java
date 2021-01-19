public class Automobile extends Giocattoli{
  private float PortataMetriTelecomando;
  private float DurataOreBatteria;
  
  public Automobile(String codice,String nome,float prezzo,int PortataMetriTelecomando,float DurataOreBatteria){
    super(codice,nome,prezzo);
    this.PortataMetriTelecomando=PortataMetriTelecomando;
    this.DurataOreBatteria=DurataOreBatteria;
   
  }
  public void setPortata(float Portata) {this.PortataMetriTelecomando=Portata;}
  public void setDurata(float Durata) {this.DurataOreBatteria=Durata;}
  public float getPortata(){return this.PortataMetriTelecomando;}
  public float getDurata(){return this.DurataOreBatteria;}
}