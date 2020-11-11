 /*nome,anno di nascita,peso,altezza,bmi
  bmi=peso(kg)/altezza(m)^2
  nome non stringa vuota
  anno di nascita compreso tra 1970 e 2000
  peso compreso tra 80 e 200
  altezza compresa tra 1.5 e 1.95
  La classe contiene metodi setter
  set nome,set anno,set peso,set altezza
  bmi viene calcolato
  metodi getter
  costruttore parametrico(prevedere di inizializzare a 0)
  costruttore copia
  inserire il metodo dimagrisci:
  questo metodo accetta come parametro i kg persi
  (sono maggiori di 0 ma il controllo va fatto nel main)
  aggiorna il peso ed il bmi)
  metodo ingrassa
  scrivere la classe persona e la classe di test
  calcola età
  */

public class Persona {
  private int anno;
  private String nome;
  private float peso,altezza,bmi;
  public Persona(int Anno,float Peso,float Altezza,String Nome)
  {
	  if(Anno>=1970 && Anno<=2000)
	  anno=Anno;
	  else
	  anno=0;
	  if(Peso>=80 && Peso<=200)
	  peso=Peso;
	  else
	  peso=0;
	  if(Altezza >= 1.5 && Altezza<=1.95)
	  altezza=Altezza;
	  else
	  altezza=0;
	  nome=Nome;
	  bmi=peso/(altezza*altezza);
  }
  public Persona(Persona p1)
  {
	  anno=p1.anno;
	  peso=p1.peso;
	  altezza=p1.altezza;
	  bmi=p1.bmi;
	  nome=p1.nome;
	  
  }
  
  public void setPeso(float Peso){if(Peso>=80 && Peso<=200)this.peso=Peso; this.bmi=this.peso/(this.altezza*this.altezza);  return ;}
  
  
  public int getAnno(){ return this.anno ;}
  public String getNome(){return this.nome ;}
  public float getPeso(){return this.peso ;}
  public float getAltezza(){ return this.altezza;}
  public float getBmi(){return this.bmi;}
  
  public void dimagrisci(float Kg)
  {
	  float Peso;
	  Peso=this.peso-Kg;
	  this.setPeso(Peso);
      return;
}
  
  public void ingrassa(float Kg)
  {
	  float Peso;
	  Peso=this.peso+Kg;
	  this.setPeso(Peso);
      return;
}
}
