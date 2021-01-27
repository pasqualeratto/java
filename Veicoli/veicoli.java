public class Veicoli 
{
  int velocita=0;
  String nome= "Veicolo generico";
  String direzione;

  public Veicoli (String nome){
    this.nome=nome;
    velocita=10;
    direzione="dritto";
  }

  public void stato(){
  System.out.println("Mi chiamo: "+ nome);
  System.out.println("Sto andando: "+ direzione);
  System.out.println("Alla velocità di: "+ velocita);
  }
}