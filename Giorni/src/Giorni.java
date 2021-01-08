import java.util.*;
public class Giorni {

	public static void main(String[] args) {
		int gg,mm,aa,gg1,mm1,aa1,somma=0;
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
	    else if(aa1>aa || (aa1==aa && mm1>mm )|| (aa1==aa && mm1==mm && gg1>gg))
	    {
	    	do
	    	{
	    		if(aa==aa1 && mm==mm1)
	    		{
	    			while(gg!=gg1)
	    			{
	    						gg++;
	    						somma++;
	    			}		
	    		}
	    		else if(aa==aa1 && mm!=mm1)
	    		{
	    			while(mm!=mm1)
	    			{
	    			if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
	    			while(gg!=31) {
	    				gg++;
	    				if(gg==31)
	    					mm++;
	    			    somma++;
	    			}
	    			else if(mm==2)
	    			{
	    				if((aa%4==0 && aa%100!=0 ) || (aa%4==0 && aa%100==0 && aa%400==0))
	    				while(gg!=29) {
		    				gg++;
		    				if(gg==29)
		    					mm++;
		    			    somma++;
	    			   }
	    				else {
	    					while(gg!=28) {
			    				gg++;
			    				if(gg==28)
			    					mm++;
			    			    somma++;
	    			                     }
	    				
	    		         	}         
	    		    }
	    			else
	    			{
	    				while(gg!=30) {
		    				gg++;
		    				if(gg==30)
		    					mm++;
		    			    somma++;
		    			}
	    			}
	    		  }
	    		}
	    		else if(aa1>aa)
	    		{
	    			System.out.println("Entrato1");
	    			do
	    			{
	    				System.out.println("Data "+ aa+" "+mm+" "+gg);
	    				if(mm==12 && gg==31)
    	    			{
    	    				aa++;
    	    				gg=0;
    	    				mm=1;
    	    			}
	    				if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
	    	    			while(gg!=31) {
	    	    				gg++;
	    	    				if(gg==31)
	    	    					mm++;
	    	    			    somma++;
	    	    			}
	    	    			else if(mm==2)
	    	    			{
	    	    				if((aa%4==0 && aa%100!=0 ) || (aa%4==0 && aa%100==0 && aa%400==0))
	    	    				while(gg!=29) {
	    		    				gg++;
	    		    				if(gg==29)
	    		    					mm++;
	    		    			    somma++;
	    	    			   }
	    	    				else {
	    	    					while(gg!=28) {
	    			    				gg++;
	    			    				if(gg==28)
	    			    					mm++;
	    			    			    somma++;
	    	    			                     }
	    	    				
	    	    		         	}     
	    	    			
	    	    		    }
	    	    			else
	    	    			{
	    	    				while(gg!=30) {
	    		    				gg++;
	    		    				if(gg==30)
	    		    					mm++;
	    		    			    somma++;
	    		    			}
	    	    			}
	    			System.out.println("Data "+ aa+" "+mm+" "+gg);
	    			}while(aa!=aa1 && mm!=mm1 && gg!=gg1);
	    		}
	    	}while(aa!=aa1 && mm!=mm1 && gg!=gg1);
	       }
	    System.out.println("I giorni di differenza sono "+somma);
	}
}

