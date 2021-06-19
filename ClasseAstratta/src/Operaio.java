
public class Operaio extends Persona{
private int livello;
 public Operaio(String nome,String cognome,String data,String residenza,int livello) {
	 super(nome,cognome,data,residenza);
	 this.livello=livello;
 }
public int getLivello() {return this.livello;}
public void setLivello(int livello) {
	if(livello>=1 && livello<=3)
	    this.livello=livello;
	else
		System.out.println("Livello non valido, inserire un livello da 1 a 3");
}

public float calcoloStipendio() {
    float stipendio;
    if(this.livello==1)
    	stipendio=1150;
    else if(this.livello==2)
    	stipendio=1200;
    else
    	stipendio=1350;
	return stipendio;
}
}


