//Gestione di un punto in 2D nel primo quadrante
package Punto2D;

public class Punto2D {
	private int x;
	private int y;
	
	//METODI
	//Setter
	public void setX(int x) {
		if(x>0) {
			this.x=x;
		}
	}
	
	public void setY(int y) {
		if(y>0) {
			this.y=y;
		}
	}

	//Getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	//Costruttori
	public Punto2D() {
		this.x=0;
		this.y=0;
	}
	
	public Punto2D(int x1, int y1) {
		if(x1>0) {
			this.x=x1;
		}
		else {
			this.x=0;
		}
		if(y1>0) {
			this.y=y1;
		}
		else {
			this.y=0;
		}
	}
	
	public Punto2D(Punto2D p2) {
		this.x=p2.x;
		this.y=p2.y;
	}

	//Metodi generici
	public float distanzaOrigine() {
		float d;
		d=(float) Math.sqrt((this.x*this.x)+(this.y*this.y));
		return d;
	}
	
	public float distanzaPunti(Punto2D p2) {
		float d;
		d=(float)Math.sqrt((this.x-p2.x)*(this.x-p2.x)+(this.y-p2.y)*(this.y-p2.y));
		return d;
	}
}