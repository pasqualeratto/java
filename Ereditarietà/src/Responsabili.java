
public class Responsabili extends Persona {
private String reparto;
private int nums,ore,ferie;
	public Responsabili(String nome,String cognome,String data,String reparto,int nums,int ore,int ferie){
	super(nome,cognome,data);
	this.reparto=reparto;
	this.nums=nums;
	this.ore=ore;
	this.ferie=ferie;
}
public void setReparto(String reparto) {
		this.reparto=reparto;
	}
	
public void setnumS(int nums) {
		this.nums=nums;
	}

public void setOre(int ore) {
	this.ore=ore;
}

public void setFerie(int ferie) {
	this.ferie=ferie;
}
public  String getNome() {return this.nome;}
public  String getCognome() {return this.cognome;}
public  String getData() {return this.data;}
public  String getReparto() {return this.reparto;}
public  int getNumS() {return this.nums;}
public  int getOre() {return this.ore;}
public  int getFerie() {return this.ferie;}

	
}
