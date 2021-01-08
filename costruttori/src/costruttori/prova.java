package costruttori;
import java.util.*;
public class prova {
	private String modello,marca;
	private int anno,potenza;
	public prova(){
		modello="";
		marca="";
		anno=2020;
		potenza=0;
	}
	public prova(int n1,int n2,String n3,String n4){
		anno=n1;
		potenza=n2;
		modello=n3;
		marca=n4;
		
	}
 public static void main(String[] Args)
  {
	 
	 prova a1,a2;
	 int n1,n2;
	 String n3,n4;
	 
	 a1=new prova();
	 Scanner inserimento=new Scanner(System.in);
	 n1=inserimento.nextInt();
	 n2=inserimento.nextInt();
	 n3=inserimento.next();
	 n4=inserimento.next();
	 a2=new prova(n1,n2,n3,n4);
	 System.out.println(a1.anno+" "+a1.potenza+" "+a1.marca+" "+a1.modello);
	 System.out.println(a2.anno+" "+a2.potenza+" "+a2.marca+" "+a2.modello);
	 
	 
  }
}
