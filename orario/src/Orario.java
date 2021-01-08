

public class Orario {
	private int ora;
	private int min;
	private int sec;
	//Interfaccia della classe
	public void setOra(int o) {
		if(o>=0 && o<=23) {
			this.ora=o;
		}
	}
	public void setMin(int m) {
		if(m>=0 && m<=59) {
			this.min=m;	//this è il puntatore all'oggetto che sto considerando
		}
	}
	public void setSec(int s) {
		if(s>=0 && s<=59) {
			this.sec=s;
		}
	}
	
	public int getOra() {return this.ora;}
	public int getMin() {return this.min;}
	public int getSec() {return this.sec;}

	//Costruttori: li riconosco perchè si chiamano come la classe
	public Orario() {
		this.ora=0;
		this.min=0;
		this.sec=0;
	}
	
	public Orario(int o, int m, int s) {
		if(o>=0 && o<=23) {
			this.ora=o;
		}
		else {
			this.ora=0;
		}
		if(m>=0 && m<=59) {
			this.min=m;
		}
		else {
			this.min=0;
		}
		if(s>=0 && s<=59) {
			this.sec=s;
		}
		else {
			this.sec=0;
		}
	}

	//Costruttore copia: consente di creare due oggetti distinti che occupano
	//zone di memoria heap distinte che sono uno il clone dell'altro
	public Orario(Orario o) {
		this.ora=o.ora;
		this.min=o.min;
		this.sec=o.sec;
	}
	
	
	//Metodi generici: consentono di modificare l'ora
	public void oraLegale() {	//Ora in meno
		if(this.ora==0) {
			this.ora=23;
		}
		else {
			this.ora=this.ora-1;
	}
	}

	public void oraSolare() {	//Ora in più
		if(this.ora==23) {
			this.ora=0;
		}
		else {
			this.ora=this.ora+1;
	}
	}
}
