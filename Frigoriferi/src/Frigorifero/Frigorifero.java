/*
Si scriva il codice di una classe Frigorifero che consenta di istanziare frigoriferi. Il prezzo di un frigorifero (espresso in euro) è determinato sulla base della sua capacità (espressa in litri) e della classe energetica (A, A+, A++, ecc).
A ciascuna classe corrispondono diversi valori di prezzi:
CLASSE                                     MOLTIPLICATORE DI PREZZO
A                                                   0,5
A+                                                 1,5
A++                                                2

Il prezzo di un frigorifero è dato dal prodotto di 5 per la capienza e per il moltiplicatore di prezzo.
ES frigorifero da 70l classe A+ = 70*5*1,5 = 525 euro
ES frigorifero da 100l classe A++ = 100*5*2=2000 euro

Scrivere il codice della classe Frigorifero inserendo i metodi setter e getter ed un costruttore parametrico (ATTENZIONE il prezzo NON può venire modificato a piacimento ma viene calcolato in base alla capacità (compresa tra 30 e 200) ed il moltiplicatore di prezzo relativo ala classe (A, A+ e A++).
Istanziare tre frigoriferi, uno per ogni classe energetica e di capienza a scelta.
Scrivere il codice della funzione BlackFriday che sconta del 30% in prezzo dei frigoriferi di classe A++.
 */
package Frigorifero;
import java.util.*;
public class Frigorifero {
private float prezzo,moltiplicatore;
private int capienza;
private String classe;
public Frigorifero(String classe, int capienza){
 this.classe=classe;
 this.capienza=capienza;
 if(this.classe.equals("A"))
	 this.moltiplicatore=(float)0.5;
 else if(this.classe.equals("A+")) 
	 this.moltiplicatore=(float)1.5;
 else
	 this.moltiplicatore=(float)2;
 this.prezzo=this.capienza*this.moltiplicatore*5;
}


public static void main(String[] Args)
{
	String classe;
	int capienza,scelta;
  Frigorifero[] array=new Frigorifero[3];
  Scanner inserimento=new Scanner(System.in);
  for(int i=0;i<3;i++) {
  do {
  System.out.println("Inserire classe energetica");
  classe=inserimento.next();
  if(!(classe.equals("A") || classe.equals("A+") || classe.equals("A++"))) {
	  System.out.println("Errore nell'inserimento della classe energetica, riprovare");
  }else
	  break;
  }while(true);
  do {
	  System.out.println("Inserire la capienza");
	  capienza=inserimento.nextInt();
	  if(!(capienza>=30 && capienza<=200)) {
		  System.out.println("Errore nell'inserimento della capacità, riprovare");
	  }else
		  break;
	  }while(true);
  array[i]=new Frigorifero(classe,capienza);
  }
  for(int i=0;i<3;i++)
   if(array[i].getClasse().equals("A++"))
	   array[i].blackFriday();
  for(int i=0;i<3;i++){
	System.out.println("Informazioni sul frigo numero "+(i+1));
	System.out.println("Capienza: "+array[i].capienza);
	System.out.println("Classe energetica: "+array[i].classe);
	System.out.println("Prezzo: "+array[i].prezzo);
  }
 
  
  
 }


public void setCapienza(int capienza) {
	  this.capienza=capienza;
	  this.prezzo=this.capienza*this.moltiplicatore*5;
}
public void setClasse(String classe) {
	  this.classe=classe;
	  this.prezzo=this.capienza*this.moltiplicatore*5;
}
public int getCapienza() {return this.capienza;}
public String getClasse() {return this.classe;}
public float getPrezzo() {return this.prezzo;}

public void blackFriday() {
	this.prezzo=(float)0.3*this.prezzo;
}


}

