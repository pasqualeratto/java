import java.util.*;
public class Ryan {	
private String nome,cognome;


public String getNome() {
	return this.nome;
}
public String getCognome() {
	return this.cognome;
}
public Ryan(Ryan oggetto) {
	this.nome=oggetto.nome;
	this.cognome=oggetto.cognome;
}
public Ryan(String n,String c) {
	this.nome=n;
	this.cognome=c;
}

public static void main(String [] Args){
   Scanner inserimento=new Scanner(System.in);
  Ryan oggetto,oggetto1;
  String n,c;
  n="Ryan";
  c="Maraglino";
  oggetto=new Ryan(n,c);
  oggetto1=new Ryan(oggetto);
  System.out.println("Oggetto 1: "+oggetto.getCognome()+" "+oggetto.getNome());
  System.out.println("Oggetto 2: "+oggetto1.getCognome()+" "+oggetto1.getNome());

 }
}
