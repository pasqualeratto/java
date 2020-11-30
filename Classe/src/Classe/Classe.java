package Classe;
public class Classe{
	  private int livello;  //è l'annualità ES 4
	  private String nome;  //ES 4AINF
	  private final int NSTUD=3;  
	  /*static: variabile è di classe e non di istanza
	  di conseguenza la variabile esiste anche se non ho oggetti istanziati di quella classe */
	  /*final: si riferisce al valore finale di una variabile, ossia l'ultimo valore che la variabile può assumere. Di conseguenza sto definendo un valore costante.*/
	  private String[] elenco;

	  public void setLivello(int l){
	    if(l>=1 && l<=5){
	      this.livello=l;
	    }
	  }

	  public void setNome(String n){
	    if(!n.equals("")){
	      this.nome=n;
	    }
	  }

	  public void setElenco(String[] e){
	    for(int i=0; i<NSTUD; i++)
	    //se per caso non avessi la costante NSTUD potrei impostare l'uscita dal ciclo for come i<e.length
	    //NO elenco=e;
	    {
	      this.elenco[i]=e[i];
	    }
	  }

	  public String getNome(){
	    return this.nome;
	  }

	  public int getLivello(){
	    return this.livello;
	  }

	  public String[] getElenco(){
	    String[] e=new String[NSTUD];
	    for(int i=0; i<NSTUD; i++){
	      e[i]=this.elenco[i];
	    }
	      return e;
	  }

	  public Classe(String n, int l, String[] e){
	    if(!n.equals("")){
	      this.nome=n;
	    }
	    else{
	      this.nome="";
	    }
	    if(l>=1 && l<=5){
	      this.livello=l;
	    }
	    else{
	      this.livello=0;
	    }
	    this.elenco=new String[NSTUD];
	    for(int i=0; i<NSTUD; i++){
	      this.elenco[i]=e[i];
	    }
	  }

}