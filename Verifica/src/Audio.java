
public class Audio extends Multimediale{
private int volume;
private int durata;
public Audio(String titolo,int durata) {
	super(titolo);
	this.volume=0;
	this.durata=durata;
}

public void alzaVolume() {
	if(this.volume>=0 && this.volume<100)
		this.volume++;
	else
		System.out.println("Impossibile alzare il volume");
}
public void abbassaVolume() {
	if(this.volume>0 && this.volume<=100)
		this.volume--;
	else
		System.out.println("Impossibile abbassare il volume");
}

public void play() {
	String esclamativo="!";
	String stringa="";
	for(int i=0;i<this.volume;i++)
		stringa+=esclamativo;
	for(int i=0;i<this.durata;i++) 
		System.out.println("Titolo "+this.getTitolo()+" "+stringa);
	
}

}
