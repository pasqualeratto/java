package Biblioteca;
class Main {
  public static void main(String[] args) {
    Biblioteca b1=new Biblioteca("Biblio", "via Pertini");

    b1.aggiungiLibro("Il signore degli anelli");
    b1.aggiungiLibro("La bussola d'oro");
    b1.aggiungiLibro("Il fantasma dell'opera");

    b1.stampaArchivio();

    if(b1.rimuoviLibro("Il fantasma dell'opera")){
      System.out.println("Libro rimosso");
    }
    else
    System.out.println("Impossibile");

    b1.stampaArchivio();

  }
}