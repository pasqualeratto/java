/*
 Si crei una classe Macchina che abbia come proprietà i seguenti attributi:
• la benzina contenuta nel serbatoio;
• i km percorsi;
• lo stato della macchina (acceso/spento).
La classe memorizza inoltre le seguenti costanti (static final): il consumo di carburante in km per
litro e la capienza massima del serbatoio in litri.
Si creino tutti i metodi che consentano di:
• inserire benzina (la quantità totale deve essere minore della capienza massima);
• controllare lo stato del serbatoio;
• percorrere i km e consumare il carburante;
• accendere e spegnere la macchina.
Successivamente si testino tutti i metodi su un opportuno oggetto di tipo Automobile. 
 */
import java.util.*;
public class Macchina {
  private int benzina,kmp;
  private boolean stato;
  private static final int consumo=6,capienza=70;
 
  public boolean inserimento(int quantità) {
	  if(this.benzina+quantità<=this.capienza){
		  this.benzina+=quantità;
		  return true;
	  }
	  else
		  return false;
  }
  
  public int getResiduo() {return this.benzina;}
  
  public boolean getStato() {return this.stato;}

  public boolean percorri(int km) {
	  if(this.stato==true && this.benzina!=0 && this.benzina-(km/this.consumo)>0) {
	  this.kmp+=km;
	  this.benzina-=(km/this.consumo);
	  return true;
	  }
	  else 
	  return false;
  }
  
  public void cambiaStato() {
	  this.stato=!this.stato;
  }
  
   public static void main(String [] Args) {
	   Macchina m1;
	   int quantità,km,scelta;
	   boolean controllo;
	   Scanner input=new Scanner(System.in);
       m1=new Macchina();
       System.out.println("La macchina è spenta, non ha carburante ed ha 0 km percorsi");
       do{
    	 System.out.println("Inserire 1 per inserire benzina");
    	 System.out.println("Inserire 2 per controllare la benzina residua");
    	 System.out.println("Inserire 3 per percorrere dei km");
    	 System.out.println("Inserire 4 per accendere/spegnere la macchina");
    	 System.out.println("Inserire 5 per terminare");
    	 scelta=input.nextInt();
    	 switch(scelta) {
    	 case 1:
    		 System.out.println("Inserire la quantità in litri di benzina da immettere");
    	       quantità=input.nextInt();
    	       controllo=m1.inserimento(quantità);
    	       if(controllo==false)
    	    	   System.out.println("Impossibile immettere la quantità di benzina inserita");
    		 break;
    	 case 2:
    		 System.out.println("Sono rimasti "+m1.getResiduo()+" litri di benzina");
    		 break;
    	 case 3:
    		 System.out.println("Inserire i km da percorrere");
    	       km=input.nextInt();
    	       controllo=m1.percorri(km);
    	       if(controllo==false)
    	    	   System.out.println("Impossibile percorrere questi km, immettere benzina o accendere la macchina");
    		 break;
    	 case 4:
    		 m1.cambiaStato();
    		 if(m1.getStato()==true)
    			 System.out.println("Ora la macchina è accesa");
    		 else
    			 System.out.println("Ora la macchina è spenta");
    		 break;
    	 }
       }while(scelta!=5);
  }
}
