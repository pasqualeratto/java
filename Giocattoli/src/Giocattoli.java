public class Giocattoli{
  protected String codice,nome;
  protected float prezzo;
 
public Giocattoli(String codice,String nome,float prezzo){
   this.codice=codice;
   this.nome=nome;
   this.prezzo=prezzo;
 }

public void setCodice(String codice) {this.codice=codice;}
public void setNome(String nome) {this.nome=nome;}
public void setPrezzo(float prezzo) {this.prezzo=prezzo;}
public String getCodice() {return this.codice;}
public String getNome() {return this.nome;}
public float getPrezzo() {return this.prezzo;}

}