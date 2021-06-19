
public class Impiegato extends Persona{
private int livello;
 public Impiegato(String nome,String cognome,String data,String residenza,int livello) {
	 super(nome,cognome,data,residenza);
	 this.livello=livello;
 }
public int getLivello() {return this.livello;}
public void setLivello(int livello) {
	if(livello>=10 && livello<=20)
	    this.livello=livello;
	else
		System.out.println("Livello non valido, inserire un livello da 10 a 20");
}

public float calcoloStipendio() {
	float stipendio=1200+(1200*this.livello/100);
	return stipendio;
}
}
