
public class Immagine extends Multimediale{
	private int luminosita;
public Immagine(String titolo,int luminosita) {
	super(titolo);
	this.luminosita=luminosita;
}

public void mostra() {
	String asterisco="*";
	String stringa="";
	for(int i=0;i<this.luminosita;i++) {
		stringa=stringa+asterisco;
	}
	System.out.println("Titolo: "+this.getTitolo()+" "+stringa);
}

}
