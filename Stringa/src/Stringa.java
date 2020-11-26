import java.util.*;
public class Stringa {

	public static void main(String[] args) {
		String stringa,stringa1,stringa2;
		Scanner inserimento=new Scanner(System.in);
		System.out.println("Inserire la prima stringa");
        stringa=inserimento.nextLine();
        System.out.println("Inserir la stringa da cercare");
        stringa1=inserimento.nextLine();
        if( stringa.indexOf(stringa1)==-1)
    	   System.out.println("Non è presente");
    	else
    	System.out.println(" è presente");
	}

}
