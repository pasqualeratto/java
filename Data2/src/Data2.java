import java.util.Scanner;
import java.util.*;
public class Data2 {
public static void main() {
	int[] array= {28,29,30,31};
	int gg,gg1,mm,mm1,aa,aa1,somma=0;
	Scanner inserimento=new Scanner(System.in);
	System.out.println("Inserire una data nel formato aa/mm/gg");
    do {
    aa=inserimento.nextInt();
    mm=inserimento.nextInt();
    if(mm>=0 && mm<=12) {
    gg=inserimento.nextInt();
    if(((mm!=2 && mm!=1 && mm!=3 && mm!=5 && mm!=7 && mm!=8 && mm!=10 && mm!=12) && gg>=1 && gg<=30)||((mm!=2 && mm!=4 && mm!=6 && mm!=9 && mm!=11)&& gg>=1 && gg<=31)||((mm==2 && gg>=1 && gg<=28)||((mm==2 && gg==29)&&(((aa%4==0 && aa%100!=0))||(aa%4==0 && aa%100==0 && aa%400==0)))))

    	break;
    else
    	System.out.println("Giorno inserito non valido,inserire di nuovo la data");	
    }else
    System.out.println("Mese inserito non valido,inserire di nuovo la data");
    
    }while(true);
    System.out.println("Inserire una seconda data nel formato aa/mm/gg");
    do {
    	aa1=inserimento.nextInt();
	    mm1=inserimento.nextInt();
	    if(mm1>=0 && mm1<=12) {
	    gg1=inserimento.nextInt();
	    if(((mm1!=2 && mm1!=1 && mm1!=3 && mm1!=5 && mm1!=7 && mm1!=8 && mm1!=10 && mm1!=12) && gg1>=1 && gg1<=30)||((mm1!=2 && mm1!=4 && mm1!=6 && mm1!=9 && mm1!=11)&& gg1>=1 && gg1<=31)||((mm1==2 && gg1>=1 && gg1<=28)||((mm1==2 && gg1==29)&&(((aa1%4==0 && aa1%100!=0))||(aa1%4==0 && aa1%100==0 && aa1%400==0)))))
	    	break;
	    else
	    	System.out.println("Giorno inserito non valido,inserire di nuovo la data");	
	    }else
	    System.out.println("Mese inserito non valido,inserire di nuovo la data");
    }while(true);
    if(aa==aa1 && mm==mm1 && gg==gg1)
    	System.out.println("Le date sono uguali non esistono giorni di differenza");
	if(aa>aa1 && aa-aa1>1)
	{
		for(int i=aa;i-aa1>1;i--)
			if((i%4==0 && i%100!=0)||(i%4==0 && i%100==0 && i%400==0))
              somma=somma+366;
              else
              somma=somma+365;
	    
	}
}
}
