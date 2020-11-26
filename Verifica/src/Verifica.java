/*
 Il programma all'avvio dovrà chiedere il nome e poi il cognome dell'utente poi procederà nel chiedere all'utente 5 frasi che andrà ad inserire dentro un array. 
Il programma stamperà il numero di lettere delle parole di ogni frase. 
ES. 
La Casa di Carta è una serie
2 4 2 5 1 3 5
In più il programma chiederà all'utente di scegliere un numero da 1 a 5 che corrisponderà alla frase e il programma dovrà stampare la somma delle lettere delle parole della frase aggiungendo la lunghezza del nome dell'utente.

COSA VERRÁ VALUTATO:
Consegna: Max 1 pt
Correttezza del programma: Max 7 pt
Indentatura e commenti: Max 2 pt
NB: Non utilizzare di altri metodi per le stringhe che non siano: substring, indexOf, compareTo, equals, charAt, length*/
import java.util.*;

public class Verifica {

	public static void main(String[] args) {
		String s1,s2;
		String s3[]=new String[5];
		int i,scelta,conta=0,conta1=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Inserire il proprio nome");
		s1=input.nextLine();
		System.out.println("Inserire il proprio cognome");
		s2=input.nextLine();
		System.out.println("Inserire adesso 5 frasi");
		for( i=0;i<s3.length;i++) //QUESTO CICLO LEGGE LE 5 FRASI
			s3[i]=input.nextLine();
		for(i=0;i<5;i++)//QUESTO CICLO CALCOLA LE LETTERE PER OGNUNA DELLE 5 FRASI
		{
			for(int j=0;j<s3[i].length();j++)
				if(s3[i].charAt(j)!=' ')
					conta++;
			System.out.println("Il numero di lettere della frase numero "+(i+1)+" è "+conta);
			conta=0;
		}
		do{//CICLO DI INSERIMENTO DEL NUMERO
		System.out.println("Inserire un numero da 1 a 5");
		scelta=input.nextInt();
		if(!(scelta>=1 && scelta<=5))
			System.out.println("Errore, inserire di nuovo");
		}while(!(scelta>=1 && scelta<=5));
		scelta-=1;
		for(i=0;i<s3[scelta].length();i++)//I DUE CICLI CALCOLANO LA SOMMA DELLE LETTERE
			if(s3[scelta].charAt(i)!=' ')
				conta++;
		//USO LO STESSO METODO E NON USO S1.LENGTH IN QUANTO TENGO CONTO CHE LA PERSONA POSSA PIU' NOMI
		//DUNQUE BISOGNA TOGLIERE GLI SPAZI
		for(i=0;i<s1.length();i++)
			if(s1.charAt(i)!=' ')
				conta++;
		System.out.println("Il numero di lettere della stringa inserita sommato alla lunghezza del nome è "+conta);
		
	}
}
