import java.util.*;
import java.time.*;
class AnnoBisestile {
  public static void main(String[] args) {
	  int annoi;
	  int mese;
	  int giorno;
	  System.out.println("Inserire una data");
	Scanner inserimento=new Scanner(System.in);
    System.out.println("Inserire l' anno");
    annoi=inserimento.nextInt();
    System.out.println("Inserire il mese");
    mese=inserimento.nextInt();
    System.out.println("Inserire il giorno");
    giorno=inserimento.nextInt();
    LocalDate anno=LocalDate.of(annoi, mese, giorno);
    if(anno.isLeapYear()==true)
    	System.out.println("L'anno è bisestile");
    else
        System.out.println("L'anno non è bisestile");


  }
}