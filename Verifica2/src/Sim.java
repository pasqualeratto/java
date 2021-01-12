/*Si vuole modellizzare una classe Java per la rappresentazione del funzionamento semplificato di
una scheda telefonica SIM.
Si devono quindi rappresentare i dati relativi alla carta SIM ed in particolare:
- il numero di telefono
- il credito disponibile in euro
- la lista delle telefonate effettuate comprendente sia il numero verso cui la telefonata è stata

effettuata sia la durata in minuti.
La SIM può memorizzare fino a 1000 telefonate massimo; tale numero va inserito in una costante.
La classe dovrà fornire le seguenti funzionalità:
- un costruttore parametrico che crea una SIM con numero di telefono, un credito e la lista delle
telefonate vuota;
- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente;
- una funzione per il calcolo dei minuti totali di conversazione;
- un metodo per eliminare tutte le telefonate effettuate verso un determinato numero passato in
input come parametro;
- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.
Testare TUTTI i metodi e le funzioni incluse nella classe SIM su opportuni oggetti.
Consegnare le due classi SIM e MAIN in un unico file indicante il vostro cognome.*/
import java.util.*;
public class Sim {
private int numero;
private float credito;
private ArrayList<Integer> lista;
private static final int massimo=1000;

public Sim(int numero,int credito) {
	this.numero=numero;
	this.credito=credito;
	this.lista=new ArrayList<Integer>();
}

public boolean inserimento(int numero, int durata) {
	if(this.lista.size()<massimo) {	
	this.lista.add(numero);
    this.lista.add(durata);
	return true;
	}
	else 
		return false;
}

public float minutiTotali() {
	float totale=0;
	for(int i=1;i<this.lista.size();i+=2)
			totale+=this.lista.get(i);
	return totale;
}

public void rimuovi(int numero) {
	boolean trovato;
	do {
		trovato=false;
	for(int i=0;i<this.lista.size();i++)
	if(this.lista.get(i)==numero) {
		this.lista.remove(i+1);
		this.lista.remove(i);
		trovato=true;
		break;
	}
	}while(trovato==true);
}

public int dimensione(){return this.lista.size();}

public int getNumero() {return this.numero;}
public float getCredito() {return this.credito;}
public int getElemento(int i) {return this.lista.get(i);}
public static void main(String[] args) {
    Sim oggetto;
    oggetto=new Sim(1234,50);
    int scelta,numero,durata;
    float totale;
    boolean controllo;
    int dimensione;
    Scanner input=new Scanner(System.in);
    do {
    	System.out.println("Inserire 1 per aggiungere una telefonata,2 per conoscere i minuti totali di conversazione,3 per eliminare le telefonate verso un numero,4 per stampare le informazioni,5 per terminare");
    	scelta=input.nextInt();
    	switch(scelta) {
    	case 1:
    		System.out.println("Inserire numero e minuti di conversazione");
    		numero=input.nextInt();
    		durata=input.nextInt();
    		controllo=oggetto.inserimento(numero,durata);
    		if(controllo==false)
    			System.out.println("Impossibile aggiungere il numero");
    		break;
    	case 2:
    		totale=oggetto.minutiTotali();
    		System.out.println("Minuti totali: "+totale);
    		break;
    	case 3:
    		System.out.println("Inserire il numero");
    		numero=input.nextInt();
    		oggetto.rimuovi(numero);
    		break;
    	case 4:
    		System.out.println("Numero: "+oggetto.getNumero());
    		System.out.println("Credito: "+oggetto.getCredito());
    		dimensione=oggetto.dimensione();
    		for(int i=0;i<dimensione;i++) {
    			System.out.println("Numero telefonato: "+oggetto.getElemento(i));
    		    i++;
    		    System.out.println("Durata: "+oggetto.getElemento(i));
    		    }
    		    
    		break;
    	}
    }while(scelta!=5);
     
	}

}
