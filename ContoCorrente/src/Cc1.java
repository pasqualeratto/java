import java.util.*;
public class Cc {

	public  static int versamento(int saldo,int ammontare){
		saldo=saldo+ammontare;
		return saldo;
		
	}
	
	public static int prelievo(int saldo,int ammontare,int array[],int conta){
	  int n=1;
		conta=conta-1;
		
		if(conta>4) {
			conta-=5*n;
			if(conta==4)
				n++;
		}
		array[conta]=ammontare;	
		saldo=saldo-ammontare;
		return saldo;
	}
	
	public static void stampaSaldo(int saldo)
	{
		System.out.println("Saldo disponibile: "+saldo);
	}
	
	public static void stampaUltimiPrelievi(int array[])
	{
		int i;
		for(i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public static void main(String[] args) {
		int saldo=0,scelta,ammontare,conta=0,array[]=new int[5];
		array[0]=0;
		array[1]=0;
		array[2]=0;
		array[3]=0;
		array[4]=0;
		Scanner inserimento=new Scanner(System.in);
		do {
			System.out.println("Inserire 1 per versare soldi sul conto");
			System.out.println("Inserire 2 per prelevare soldi dal conto");
			System.out.println("Inserire 3 per stampare il saldo");
			System.out.println("Inserire 4 per visualizzare gli ultimi 5 prelivi");
			System.out.println("Inserire 5 per terminare il programma");
			scelta=inserimento.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("Inserire l'ammontare del versamento");
				ammontare=inserimento.nextInt();
				saldo=versamento(saldo,ammontare);
				break;
			case 2:
				if(saldo!=0) {
					System.out.println("Inserire l'ammontare del prelievo");
					ammontare=inserimento.nextInt();
					if(saldo-ammontare>=0) {
						conta++;
				saldo=prelievo(saldo,ammontare,array,conta);
					}else {
						System.out.println("Saldo non sufficiente al prelievo");
					stampaSaldo(saldo);
					}
				    }else
					System.out.println("Non sono presenti soldi sul conto");
				break;
			case 3:
				stampaSaldo(saldo);
				break;
			case 4:
				stampaUltimiPrelievi(array);
				break;
			}
		}while(scelta!=5);
		
	}

}
