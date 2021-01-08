/*Scrivere il codice che consente di creare una classe che descrive
il funzionamento di una semplice biblioteca di un piccolo paesello contenente i sgeuenti attributi:
- nome biblioteca, indirizzo;
- archivio dei titoli disponibili.
La classe deve essere corredata dei seguenti metodi:
- costruttore parametrico;
- metodi che consentono l'aggiunta e l'eliminazione di un titolo (attenzione il numero massimo di libri concesso è fissato da una costante);
- metodo che consente in ogni momento di conoscere il numero di libri disponibili.

Provare tutti i metodi su un oggetto opportuno.*/

package Biblioteca;
import java .util.*;


public class Biblioteca{
  private String nome;
  private String indirizzo; //via e numero civico
  private static final int num=100;
  private ArrayList<String> archivio; //Per ora archivio è un riferimento ad un ipotetico ArrayList

  public Biblioteca(String nome, String indirizzo){
    this.nome=nome;
    this.indirizzo=indirizzo;
    this.archivio=new ArrayList<String>();  //Da questo momento archivio è un ArrayList contenente ipotetici oggetti di tipo String vuoto
  }

  public boolean aggiungiLibro(String titolo){
    if(this.archivio.size()<num){
      this.archivio.add(titolo);
      return true;
    }
    else return false;
  }

  public boolean rimuoviLibro(String titolo){
    for(int i=0; i<this.archivio.size(); i++){
      if(titolo.equals(this.archivio.get(i))){
        this.archivio.remove(i);
        return true;
      }
    }
    return false;
  }

  public int contaLibri(){
    return this.archivio.size();
  }

//Serve SOLO per stampare i titoli dei libri presenti nel mio archivio
  public void stampaArchivio(){
    for(int i=0; i<this.archivio.size();i++){
      System.out.println(this.archivio.get(i));
    }
  }
}