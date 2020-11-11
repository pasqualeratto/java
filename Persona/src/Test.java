import java.util.*;
public class Test {
 public static void main(String [] Args)
 {
	 int scelta;
	 float Kg;
	 Persona p1,p2;
	 Scanner inserimento=new Scanner(System.in);
	 System.out.println("Inserire l'anno di nascita, il peso,l'altezza in metri e il proprio nome");
	 p1=new Persona(inserimento.nextInt(),inserimento.nextFloat(),inserimento.nextFloat(),inserimento.next());
	 p2=new Persona(p1);
	 do
	 {
		 System.out.println("Inserire 1 per stampare tutte le informazioni");
		 System.out.println("Inserire 2 diminuire il peso dei kg indicati");
		 System.out.println("Inserire 3 aumentare il peso dei kg indicati");
		 scelta=inserimento.nextInt();
		 switch(scelta)
		 {
		 case 1:
			 System.out.println("Nome: "+p1.getNome());
			 System.out.println("Anno di nascita: "+p1.getAnno());
			 System.out.println("Peso: "+p1.getPeso());
			 System.out.println("Altezza: "+p1.getAltezza());
			 System.out.println("Bmi: "+p1.getBmi());
			 System.out.println("Età: "+(2020-p1.getAnno()));
			 break;
		 case 2:
			 System.out.println("Inserire il peso da togliere");
			 Kg=inserimento.nextFloat();
			 Kg=p1.getPeso()-Kg;
				 p1.setPeso(Kg);
			 break;
		 case 3:
			 System.out.println("Inserire il peso da aumentare");
			 Kg=inserimento.nextFloat();
			 Kg=p1.getPeso()+Kg;
			 p1.setPeso(Kg);
			 break;
		 }
	 }
	 while(scelta!=4);
	 
	 
 }
}
