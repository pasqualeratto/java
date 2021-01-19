/*Scrivere un programma che contenga come classe madre la la classe GIOCATTOLO questa classe conterrà un codice a barre, un nome e un prezzo.
Questa classe ha diverse classi figlie con  le seguenti variabili:
Automobile ( PortataMetriTelecomando, DurataOreBatteria)
GiocoDaTavolo (NumeroGiocatoriMinimo, NumeroGiocatoriMassimo)
GiochiNeonati (MaterialeDelGioco)
GiochiElettronici (DurataDellaBatteria, DimensioniDisplay)
Le varie classi figlie hanno il costruttore(parametrico) per poter inizializzare le variabili e i vari metodi get e set per poter modificare o stampare un oggetto.
Il main permetterà di aggiungere un giocattolo, stampare i nomi di tutti i giocattoli o stampare un singolo giocattolo con le relative informazioni.
(Per la stampa di un singolo giocattolo si utilizzi il codice a barre per poterlo cercare nell'array)*/
import java.util.*;
public class Main {
public static void main(String[] Args) {
    ArrayList<Automobile> a=new ArrayList<Automobile>();
	ArrayList<GiochiDaTavolo> gt=new ArrayList<GiochiDaTavolo>();
	ArrayList<GiochiNeonati> gn=new ArrayList<GiochiNeonati>();
	ArrayList<GiochiElettronici> ge=new ArrayList<GiochiElettronici>();
	int  portatametri,scelta=0,nummin,nummax,indice;
	float durata,dimensione,prezzo;
	boolean trovato=false;
	String materiale,nome,codice;
	Scanner input=new Scanner(System.in);
	do {
		System.out.println("Inserire 1 per aggiungere un Automobile");
		System.out.println("Inserire 2 per aggiungere un gioco da tavolo");
		System.out.println("Inserire 3 per aggiungere un gioco per neonato");
		System.out.println("Inserire 4 per aggiungere un gioco elettronico");
		System.out.println("Inserire 5 per stampare tutti i nomi presenti");
		System.out.println("Inserire 6 per stampare le informazioni di un giocattolo");
		System.out.println("Inserire 7 per terminare il programma");
        scelta=input.nextInt();
        switch(scelta) {
        case 1:
        	System.out.println("Inserire nome,codice a barre e prezzo");
        	nome=input.next();
        	codice=input.next();
        	prezzo=input.nextFloat();
        	System.out.println("Inserire la portata in metri del telecomando e la durata in ore della batteria");
        	portatametri=input.nextInt();
        	durata=input.nextFloat();
        	a.add(new Automobile(codice,nome,prezzo,portatametri,durata));
        	break;
        case 2:
        	System.out.println("Inserire nome,codice a barre e prezzo");
        	nome=input.next();
        	codice=input.next();
        	prezzo=input.nextFloat();
        	System.out.println("Inserire il numero minimo e massimo di giocatori");
        	nummin=input.nextInt();
        	nummax=input.nextInt();
        	gt.add(new GiochiDaTavolo(codice,nome,prezzo,nummax,nummin));
        	break;
        case 3:
        	System.out.println("Inserire nome,codice a barre e prezzo");
        	nome=input.next();
        	codice=input.next();
        	prezzo=input.nextFloat();
        	System.out.println("Inserire il materiale");
        	materiale=input.next();
        	gn.add(new GiochiNeonati(codice,nome,prezzo,materiale));
        	break;
        case 4:
        	System.out.println("Inserire nome,codice a barre e prezzo");
        	nome=input.next();
        	codice=input.next();
        	prezzo=input.nextFloat();
        	System.out.println("Inserire la durata della batteria e la dimensione del display in pollici");
        	durata=input.nextFloat();
        	dimensione=input.nextFloat();
        	ge.add(new GiochiElettronici(codice,nome,prezzo,durata,dimensione));
        	break;
        case 5:
        	for(int i=0;i<a.size();i++)
        		System.out.println("Nome automobile "+(i+1)+": "+a.get(i).getNome());
        	for(int i=0;i<gt.size();i++)
        		System.out.println("Nome gioco da tavolo "+(i+1)+": "+gt.get(i).getNome());
        	for(int i=0;i<gn.size();i++)
        		System.out.println("Nome gioco per neonati "+(i+1)+": "+gn.get(i).getNome());
        	for(int i=0;i<ge.size();i++)
        		System.out.println("Nome gioco elettronico "+(i+1)+": "+ge.get(i).getNome());
        	break;
        case 6:
        	System.out.println("Inserire il codice a barre del prodotto");
        	codice=input.next();
        	for(int i=0;i<a.size();i++)
        	if(a.get(i).getCodice().equals(codice)) {
        		System.out.println("Automobile");
        		System.out.println("Nome: "+a.get(i).getNome());
        		System.out.println("Prezzo: "+a.get(i).getPrezzo());
        		System.out.println("Portata in metri del telecomando: "+a.get(i).getPortata());
        		System.out.println("Durata in ore della batteria: "+a.get(i).getDurata());
        		trovato=true;
        		break;
        	}
        	for(int i=0;i<gt.size();i++)
            if(gt.get(i).getCodice().equals(codice) && trovato==false) {
        		System.out.println("Gioco da tavolo");
        		System.out.println("Nome: "+gt.get(i).getNome());
        		System.out.println("Prezzo: "+gt.get(i).getPrezzo());
        		System.out.println("Numero giocatori minimo: "+gt.get(i).getNumeroMinimo());
        		System.out.println("Numero giocatori massimo: "+gt.get(i).getNumeroMassimo());
        		trovato=true;
        		break;
        	}
        	for(int i=0;i<gn.size();i++)
            if(gn.get(i).getCodice().equals(codice) && trovato==false) {
            	System.out.println("Gioco per neonati");
            	System.out.println("Nome: "+gn.get(i).getNome());
        		System.out.println("Prezzo: "+gn.get(i).getPrezzo());
        		System.out.println("Materiale: "+gn.get(i).getMateriale());
        		trovato=true;
        		break;
        	}
        	for(int i=0;i<ge.size();i++)
        	if(ge.get(i).getCodice().equals(codice) && trovato==false) {
        		System.out.println("Gioco elettronico");
        		System.out.println("Nome: "+ge.get(i).getNome());
        		System.out.println("Prezzo: "+ge.get(i).getPrezzo());
        		System.out.println("Durata della batteria"+ge.get(i).getDurata());
        		System.out.println("Dimensione display in pollici: "+ge.get(i).getDimensione());
        		trovato=true;
        		break;
        	}
        	if(trovato==false)
        		System.out.println("Giocattolo non esistente");
        		
        		
        	break;
        }
	}while(scelta!=7);
}
}
