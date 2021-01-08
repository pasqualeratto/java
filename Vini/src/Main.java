import java.util.*;
class Main {
  public static void main(String[] args) {
    Vini v;
    String nome;
    float media;
    Scanner input=new Scanner(System.in);
    v=new Vini("Antonio");
    v.aggiungiVino("Bardolino", 5);
    v.aggiungiVino("Chianti", 10);
    v.aggiungiVino("Spumante", 13);
    v.stampaListino();
    System.out.println("Inserire il nome del vino da cercare");
    nome=input.next();
    v.cerca(nome);
    media=v.media();
    System.out.println("La media dei prezzi presenti è "+media);
    System.out.println("Inserire il nome del vino da rimuovere");
    nome=input.next();
    v.rimuovi(nome);
    v.stampaListino();
  }
}