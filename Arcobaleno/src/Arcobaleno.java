/*
 Progettare una classe di nome Arcobaleno, che abbia come variabili di istanza (attributi non STATIC) private String[ ] colori e private int numeroColori. I metodi richiesti sono:
public Arcobaleno(int Max), Il costruttore inizializza le variabili di istanza, la lunghezza dell’array colori è passata come parametro esplicito max. 
public void aggiungiColore(String unColore), aggiunge un colore all’array colori.
public void rimuoviColore(StringUnColore), elimina il colore dall’array colori.
public int coloriVisibili() restituisce il numero di colori presenti nell’array colori.
L’array colori deve essere gestito come un array parzialmente riempito e non può contenere più colori uguali.
L’array gestito come parzialmente riempito significa che va riempito dell’indice zero in avanti in modo ordinato, non casuale, così da sapere dove sono gli i “cassetti” pieni e quelli vuoti. La variabile numeroColori segna il limite tra i “cassetti” pieni e quelli vuoti, viene chiamata anche sentinella, e precisamente indica il primo “cassetto” vuoto.
Visto che non ci possono essere più colori uguali nell’array è necessario fare un controllo ogni volta che un colore viene inserito: si verifica che non sia già presente nell’array.
Si consiglia implementare un metodo ausiliario private int cercaColore(String unColore) che cerca un colore nell’array colori, restituisce -1 se il colore non è presente, restituisce un numero apantenente all’intervallo [0, max] se il colore viene trovato, il numero ne indica anche la posizione nell’array colori.
 */
import java.util.*;
public class Arcobaleno {
	private String[] colori;
	private int numeroColori;
public Arcobaleno(int Max) {
	this.colori=new String[Max];
	numeroColori=0;
}
public int aggiungiColore(String colore,int sentinella) {
	int trovato = 0;
	if(sentinella!=0)
	trovato=this.controllo(colore,sentinella);
	else {
		this.colori[sentinella]=colore;
		sentinella++;
		trovato=2;
	}
	if(trovato==0) {
		this.colori[sentinella]=colore;
	    sentinella++;}
	 else if(trovato==1)
	System.out.println("Colore già presente");
	return sentinella;
}
public int rimuoviColore(String colore,int sentinella) {
	if(sentinella!=0) {
	for(int i=0;i<sentinella;i++)
   	 if(this.colori[i].equals(colore)){
   		 for(;i<sentinella;i++)
			this.colori[i]=this.colori[i+1];
	}

	}
	return sentinella;
}
public int controllo(String colore,int sentinella) {
	int trovato=0;
     for(int i=0;i<sentinella;i++)
    	 if(this.colori[i].equals(colore))
    		 trovato=1;
     return trovato;
}
public void stampa(int sentinella)
{
	for(int i=0;i<sentinella-1;i++)
		System.out.println(this.colori[i]);
}
public static void main(String [] Args) {
	int sentinella=0;
	int scelta;
	String colore;
	Arcobaleno oggetto;
	Scanner input=new Scanner(System.in);
	System.out.println("Inserire la grandezza dell'array");
	oggetto=new Arcobaleno(input.nextInt());
	do {
		System.out.println("Inserire 1 per aggiungere un colore\ninserire 2 per rimuovere il colore\ninserire 3 per visualizzare il numero di colori\ninserire 4 per stampare l'array\ninserire 5 per terminare");
		scelta=input.nextInt();
		switch(scelta) {
		case 1:
			System.out.println("Inserire il colore da aggiungere");
			colore=input.next();
			sentinella=oggetto.aggiungiColore(colore,sentinella);
			break;
		case 2:
			System.out.println("Inserire il colore da rimuovere");
			colore=input.next();
			sentinella=oggetto.rimuoviColore(colore, sentinella);
			break;
		case 3:
			System.out.println("I colori disponibili sono: "+sentinella);
			break;
		case 4:
		    oggetto.stampa(sentinella);
		}
	}while(scelta!=5);
}
}
