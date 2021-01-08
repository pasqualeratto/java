/*
Scrivere il codice della classe Prodotto; tale classe rappresenta un prodotto venduto in un
supermercato ed è caratterizzato dal:
• nome;
• genere (alimentari, igiene, animali, ecc);
• un array con i prezzi mensili del prodotto nel 2020(12 prezzi in tutto).
Scrivere poi i metodi che consentono di:
• istanziare un generico prodotto utilizzando il costruttore parametrico;
• determinare la media dei prezzi annuali del prodotto;
• determinare il mese in cui il prezzo è stato minore e quello in cui è stato maggiore.
• Stampare i dati del prodotto in un qualunque istante.
Testare tutti i metodi su un opportuno oggetto di tipo prodotto.
*/
import java.util.*;
public class Prodotto {
	private String nome,genere;
	private int prezzi[]=new int[12];

	public Prodotto(int prezzi[],String nome, String genere) {
		for(int i=0;i<12;i++)
			this.prezzi[i]=prezzi[i];
		 this.genere=genere;
		 this.nome=nome;
	}
	
	public float media() {
		float media=0;
		for(int i=0;i<12;i++)
			media+=this.prezzi[i];
		media/=12;
		return media;
	}
	
	public int maggiore() {
		int maggiore=this.prezzi[0];
		for(int i=1;i<12;i++)
			if(this.prezzi[i]>maggiore)
				maggiore=this.prezzi[i];
		return maggiore;
	}
	
	public int minore() {
		int minore=this.prezzi[0];
		for(int i=1;i<12;i++)
			if(this.prezzi[i]<minore)
				minore=this.prezzi[i];
		return minore;
	}
	
	public String getNome() { return this.nome;}
	public String getGenere() { return this.genere;}

	public static void main(String[] args) {
         Prodotto p;
         int prezzi[]=new int[12],scelta,maggiore,minore;
         float media;
         Scanner input=new Scanner(System.in);
         String genere,nome;
         System.out.println("Inserire il nome, il genere ed i 12 prezzi del prodotto");
         nome=input.next();
         genere=input.next();
         for(int i=0;i<12;i++)
         prezzi[i]=input.nextInt();
         p=new Prodotto(prezzi,nome,genere);
         media=p.media();
         System.out.println("La media dei prezzi è: "+media);
         maggiore=p.maggiore();
         minore=p.minore();
         System.out.println("Il prezzo maggiore è stato: "+maggiore+" mentre quello minore: "+minore);
         System.out.println("Nome del prodotto: "+p.getNome()+" Genere del prodotto: "+p.getGenere()+" Prezzi:");
         for(int i=0;i<12;i++)
        	 System.out.println(prezzi[i]);
         
	}

}
