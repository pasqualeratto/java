import java.util.ArrayList;

public class Vini{
  private String nome;
  private ArrayList<String> vini;
  private ArrayList<Integer> prezzi;

  public Vini(String n){
    this.nome=n;
    vini=new ArrayList<String>();
    prezzi=new ArrayList<Integer>();
  }

  public void aggiungiVino(String nv, int p){
    vini.add(nv);
    prezzi.add(p);
  }

  public void stampaListino(){
    for(int i=0; i<vini.size(); i++){
      System.out.println("Vino: "+vini.get(i)+" prezzo: "+prezzi.get(i));
    }
  }
  public void cerca(String nv) {
	  int indice;
	  indice=vini.indexOf(nv);
	  if(indice==-1)
		  System.out.println("Il vino inserito non è presente");
	  else
		  System.out.println("Il prezzo del vino inserito è "+prezzi.get(indice));
  }

  public float media() {
	  float media=0;
	  for(int i=0;i<prezzi.size();i++)
		  media+=prezzi.get(i);
	  media/=prezzi.size();
	  return media;
  }

 public void rimuovi(String nv) {
	 int indice;
	  indice=vini.indexOf(nv);
     prezzi.remove(indice);
	 vini.remove(nv);
 }



}