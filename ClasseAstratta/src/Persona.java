
public abstract class Persona {
protected String nome,cognome,data,residenza;
public Persona(String nome,String cognome,String data,String residenza) {
	this.nome=nome;
	this.cognome=cognome;
	this.data=data;
	this.residenza=residenza;
}

public String getNome() {return this.nome;}
public String getCognome() {return this.cognome;}
public String getData() {return this.data;}
public String getResidenza() {return this.residenza;}
public void setResidenza(String residenza) {this.residenza=residenza;}

public abstract float calcoloStipendio(); 

}
