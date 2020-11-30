package Classe;
class Main {
	  public static void main(String[] args) {
	    /*Il metodo main è definito static perchè
	    è un metodo di classe e non di istanza
	    Se il metodo main fosse un metodo senza static
	    ossia fosse un metodo di istanza dovrei richiamarlo così:
	    Main m=new Main();
	    m.main();*/
	    String[] e=new String[3];
	    e[0]="Gigi";
	    e[1]="Franco";
	    e[2]="Francesca";

	    Classe cl1;
	    cl1=new Classe("5BINF", 5, e);

	    e=cl1.getElenco();
	    for(int i=0; i<e.length; i++){
	      System.out.println(e[i]);
	    }

	    e[1]="Giuseppino";
	    for(int i=0; i<3; i++){
	      System.out.println(cl1.getElenco()[i]);
	     
	    }
	    
	  }
	}