/*Creare un programma gestionale che si occupa di inserire dentro 2 array i responsabili e in un altro i sottoposti.
La classe madre sarà persone che conterrà un nome, cognome e data di nascita.
Ogni responsabile e sottoposto deve essere assegnato a un reparto. 
I responsabili avranno inoltre un parametro che contiene il numero dei sottoposti,  le ore di lavoro a settimana, il numero di giorni di ferie e i loro metodi di modifica e stampa (set e get)
I sottoposti avranno inoltre anche le ore di lavoro a settimana, il numero di giorni di ferie e i loro metodi di modifica e stampa (set e get)*/
import java.util.*;
public class Main {
public static void main(String[] Args) {
	String nome,cognome,data,reparto;
	int responsabili,sottoposti,dimensione,nums,ore,ferie;
	Scanner input=new Scanner(System.in);
	System.out.println("Inserire il numero di responsabili");
	dimensione=input.nextInt();
	Responsabili array[]=new Responsabili[dimensione];
	for(int i=0;i<dimensione;i++) {
		System.out.println("Inserire nome,cognome,data di nascita, reparto del responsabile,numero dei sottoposti,ore lavorative e giorni di ferie");
		nome=input.next();
		cognome=input.next();
		data=input.next();
		reparto=input.next();
		nums=input.nextInt();
		ore=input.nextInt();
		ferie=input.nextInt();
		array[i]=new Responsabili(nome,cognome,data,reparto,nums,ore,ferie);
	}
	System.out.println("Inserire il numero di sottoposti");
	dimensione=input.nextInt();
	Sottoposti array2[]=new Sottoposti[dimensione];
	for(int i=0;i<dimensione;i++) {
		System.out.println("Inserire nome,cognome,data di nascita,reparto del sottoposto,ore lavorative e giorni di ferie");
		nome=input.next();
		cognome=input.next();
		data=input.next();
		reparto=input.next();
		ore=input.nextInt();
		ferie=input.nextInt();
		array2[i]=new Sottoposti(nome,cognome,data,reparto,ore,ferie);
	    System.out.println("Informazioni sui responsabili:");
	    for(i=0;i<array.length;i++) {
	    	System.out.println("Nome: "+array[i].getNome());
	    	System.out.println("Cognome: "+array[i].getCognome());
	    	System.out.println("Data di nascita: "+array[i].getData());
	    	System.out.println("Reparto: "+array[i].getReparto());
	    	System.out.println("Numero sottoposti: "+array[i].getNumS());
	    	System.out.println("Ore settimanali: "+array[i].getOre());
	    	System.out.println("Giorni di ferie: "+array[i].getFerie());
	    }
	    System.out.println("Informazioni sui sottoposti:");
	    for(i=0;i<array.length;i++) {
	    	System.out.println("Nome: "+array2[i].getNome());
	    	System.out.println("Cognome: "+array2[i].getCognome());
	    	System.out.println("Data di nascita: "+array2[i].getData());
	    	System.out.println("Reparto: "+array2[i].getReparto());
	    	System.out.println("Ore settimanali: "+array2[i].getOre());
	    	System.out.println("Giorni di ferie: "+array2[i].getFerie());
	    }
	
	}

}
}
