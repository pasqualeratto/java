package banca;

import java.util.Scanner;

public class ContoCorrente {
	private int numConto,saldo;	//Numero univoco conto corrente
	private String nome;
	
	//Metodi setter
	/*Specifiche:
	 * - numConto >0
	 * - nome != ""
	 * - saldo qualunque valore
	 */
	
	//Metodi getter
	
	//Costruttori
	/*Specifiche:
	+"
	 * - costruttore parametrico: attenzione rispettare le specifiche scritte per i setter
	 */
	
	//Metodi generici
	//Versamento: dato come parametro la quantità di soldi da versare aggiorno il saldo
	//Prelievo: dato come parametro la quantità di denaro da prelevare
	//aggiornare il saldo soltanto se ho denaro a sufficienza.
	public ContoCorrente() {
		this.nome="";
		this.numConto=1;
		this.saldo=0;
	}
	
	public ContoCorrente(int numConto,int saldo,String nome){
		this.nome=nome;
		this.numConto=numConto;
		this.saldo=saldo;
		
	}

	public void setNome(String nome){
		if(nome!="")
		this.nome=nome;
	}
	
	public void setSaldo(int saldo){
		this.saldo=saldo;
	}
	
	public void setNumConto(int numConto){
		if(numConto>0)
		this.numConto=numConto;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getSaldo(){
		return this.saldo;
	}
	
	public int getNumConto(){
		return this.numConto;
	}
	
	public void Versamento(int ammontare) {
		this.saldo=this.saldo+ammontare;
	}
	
	public void Prelievo(int ammontare) {
		if(this.saldo-ammontare>=0)
		this.saldo=this.saldo-ammontare;
	}
	public static void main(String [] Args)
	{
		ContoCorrente conto1,conto2;
		int numConto,saldo,scelta,ammontare;
		String nome;
		conto1=new ContoCorrente();
		conto2=new ContoCorrente(2,5000,"Pasquale");
		Scanner inserimento=new Scanner(System.in);
		System.out.println("Inserire il numero del conto,il saldo ed il nome");
        numConto=inserimento.nextInt();
        saldo=inserimento.nextInt();
        nome=inserimento.next();
        conto1.setNome(nome);
        conto1.setNumConto(numConto);
        conto1.setSaldo(saldo);
        do {
			System.out.println("Inserire 1 per versare soldi sul conto");
			System.out.println("Inserire 2 per prelevare soldi dal conto");
			System.out.println("Inserire 3 per stampare il saldo");
			System.out.println("Inserire 4 per terminare il programma");
			scelta=inserimento.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("Inserire l'ammontare del versamento");
				ammontare=inserimento.nextInt();
				conto1.Versamento(ammontare);
				break;
			case 2:
				System.out.println("Inserire l'ammontare del prelievo");
			    ammontare=inserimento.nextInt();
			    	conto1.Prelievo(ammontare);
				break;
			case 3:
				System.out.println("Numero del conto: "+conto1.getNumConto());
				System.out.println("Nome: "+conto1.getNome());
				System.out.println("Saldo: "+conto1.getSaldo());
				break;
	                       } 
            }while(scelta!=4);
	}
}

