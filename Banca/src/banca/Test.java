package banca;
import java.util.*;
public class Test {
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
