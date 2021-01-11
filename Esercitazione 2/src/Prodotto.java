/*SI scriva il codice della classe Prodotto; tale classe deve consentire la memorizzazione di alcuni dati di un generico prodotto quali un codice, il nome, la categoria di appartenenza (alimento, prodotto per la pulizia, igiene personale, ecc) ed un array contenente i prezzi del prodotto nei 12 mesi dell'anno 2020.
Scrivere la classe corredandola di costruttore parametrico, un metodo che consenta di determinare il prezzo medio assunto dal prodotto nel 2020 ed il prezzo minimo e massimo, ed un metodo che consenta di stampare i dati ed i prezzi assunti.
testare tutti i metodi su opportuni oggetti*/
import java.util.*;
public class Prodotto {
private String nome,categoria;
private int codice,array[]=new int[12];

public Prodotto(String nome,String categoria,int codice,int array[]) {
	this.nome=nome;
	this.categoria=categoria;
	this.codice=codice;
	for(int i=0;i<array.length;i++)
		this.array[i]=array[i];
}
public float prezzoMedio() {
	float media=0;
	for(int i=0;i<this.array.length;i++)
		media+=this.array[i];
	media/=this.array.length;
	return media;
}

public int massimo() {
	int massimo=this.array[0];
	for(int i=1;i<this.array.length;i++)
		if(this.array[i]>massimo)
			massimo=this.array[i];
	return massimo;
}


public int minimo() {
	int minimo=this.array[0];
	for(int i=1;i<this.array.length;i++)
		if(this.array[i]<minimo)
			minimo=this.array[i];
	return minimo;
}

public String getNome() { return this.nome;}
public String getCategoria() { return this.categoria;}
public int getCodice() { return this.codice;}
public static void main(String[] Args) {
	Prodotto p;
	int array[]= {1,2,4,3,6,1,2,3,3,1,7,2};
	int massimo,minimo;
	float media;
	p=new Prodotto("Prosciutto","alimentari",1234,array);
	media=p.prezzoMedio();
	massimo=p.massimo();
	minimo=p.minimo();
	System.out.println("Il prezzo medio del prodotto è stato: "+media);
	System.out.println("Il prezzo massimo del prodotto è stato: "+massimo);
	System.out.println("Il prezzo minimo del prodotto è stato: "+minimo);
	System.out.println("Il nome del prodotto è : "+p.getNome());
	System.out.println("La categoria del prodotto è : "+p.getCategoria());
	System.out.println("Il codice del prodotto è : "+p.getCodice());
	System.out.println("I prezzi del prodotto sono stati: ");
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
}

}
