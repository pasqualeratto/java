import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class FormattazioneData {
  public static void main(String[] Args) {
	  int giorno,mese,anno,scelta;
	  String[] array1=new String[5];
	  Scanner inserimento=new Scanner(System.in);
   LocalDate [] array=new LocalDate[5];	  
   System.out.println("Inserire 5 date");
   for(int i=0;i<5;i++)
   {
	   System.out.println("Inserire l' anno");
	   anno=inserimento.nextInt();
	   System.out.println("Inserire il giorno");
	   giorno=inserimento.nextInt();
	   System.out.println("Inserire il mese");
	   mese=inserimento.nextInt();
	   array[i]=LocalDate.of(anno, mese, giorno);
   }
   do {
   System.out.println("Inserire 1 per stampare nel formato anno,mese,giorno");
   System.out.println("Inserire 2 per stampare nel formato mese,giorno,anno");
   System.out.println("Inserire 3 per stampare nel formato giorno mese anno");
   scelta=inserimento.nextInt();
   if(scelta==1) {
	   DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	   for(int i=0;i<5;i++)
		   array1[i]=array[i].format(formato);
   }else if(scelta==2) {
	   DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	   for(int i=0;i<5;i++)
		   array1[i]=array[i].format(formato);
   }
   else {
	   DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	   for(int i=0;i<5;i++)
		   array1[i]=array[i].format(formato);
   }
	   for(int i=0;i<5;i++)
		   System.out.println(array1[i]);
   }while(true);
  }
 }
