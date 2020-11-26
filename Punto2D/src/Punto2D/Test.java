package Punto2D;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Punto2D p1,p2;
		int x,y;
		float distanzaO,distanzaP;
		p1=new Punto2D(3,5);
		p2=new Punto2D(p1);
        System.out.println("Inserire x e y del punto");
        Scanner inserimento=new Scanner(System.in);
		p2.setX(x=inserimento.nextInt());
		p2.setY(y=inserimento.nextInt());
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		distanzaO=p2.distanzaOrigine();
		distanzaP=p1.distanzaPunti(p2);
		System.out.println(distanzaO);
		System.out.println(distanzaP);
	}
}