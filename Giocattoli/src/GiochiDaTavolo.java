public class GiochiDaTavolo extends Giocattoli{
private int NumeroGiocatoriMinimo,NumeroGiocatoriMassimo;

public GiochiDaTavolo(String codice,String nome,float prezzo,int NumeroGiocatoriMassimo,int NumeroGiocatoriMinimo){
  super(codice,nome,prezzo);
  this.NumeroGiocatoriMinimo=NumeroGiocatoriMinimo;
  this.NumeroGiocatoriMassimo=NumeroGiocatoriMassimo;
  
}

public void setNumeroMinimo(int minimo){this.NumeroGiocatoriMinimo=minimo;}
public void setNumeroMassimo(int massimo){this.NumeroGiocatoriMassimo=massimo;}
public int getNumeroMinimo(){return this.NumeroGiocatoriMinimo;}
public int getNumeroMassimo(){return this.NumeroGiocatoriMassimo;}

}