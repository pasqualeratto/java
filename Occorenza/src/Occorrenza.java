import java.util.*;
public class Occorrenza {
public static void main(String [] Args) {
	String s1;
	int conta=0;
	int i,j;
	Scanner input=new Scanner(System.in);
	System.out.println("Inserire una stringa");
     s1=input.nextLine();
	for(i=0;i<s1.length();i++) {
		for( j=0;j<s1.length();j++) {
		if(s1.charAt(j)==s1.charAt(i) && j>=s1.indexOf('c')) {
			conta++;
		}
		else
		    conta=0;
		}
		if(conta!=0)
		System.out.println("La lettera "+s1.charAt(i)+" è presente "+conta+" volte");
		conta=0;
	}
}
}
