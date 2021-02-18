import java.util.*;
public class Main {
	public static void main(String [] Args) {
     int scelta;
     String titolo;
     int luminosita,durata,i;
     boolean trovato;
     Scanner input=new Scanner(System.in);
     ArrayList<Immagine> immagine=new ArrayList<Immagine>();
     ArrayList<Audio> audio=new ArrayList<Audio>();
		do {
			System.out.println("1 per inserire un'immagine");
			System.out.println("2 per inserire un audio");
			System.out.println("3 per mostrare le informazioni su un'immagine");
			System.out.println("4 per alzare il volume di un audio");
			System.out.println("5 per abbassare il volume di un audio");
			System.out.println("6 per il metodo play");
			System.out.println("7 per rimuovere un'immagine");
			System.out.println("8 per rimuovere un'audio");
			System.out.println("9 per uscire");
			scelta=input.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("Inserire il titolo");
				titolo=input.next();
				System.out.println("Inserire la luminosità");
				luminosita=input.nextInt();
				immagine.add(new Immagine(titolo,luminosita));
				break;
			case 2:
				System.out.println("Inserire il titolo");
				titolo=input.next();
				System.out.println("Inserire la durata");
				durata=input.nextInt();
				audio.add(new Audio(titolo,durata));
				break;
			case 3:
				trovato=false;
				if(immagine.size()!=0) {
					System.out.println("Inserire il titolo dell'immagine da visualizzare");
					titolo=input.next();
				for(i=0;i<immagine.size();i++)
					if(immagine.get(i).getTitolo().equals(titolo)) {
					immagine.get(i).mostra();
					trovato=true;
					break;
					}
				if(trovato==false)
					System.out.println("Errore, non trovato");
				}
				else
					System.out.println("Non sono presenti immagini");
				break;
			case 4:
				trovato=false;
				if(audio.size()!=0) {
					System.out.println("Inserire il titolo dell'audio di cui alzare il volume");
					titolo=input.next();
				for(i=0;i<audio.size();i++)
					if(audio.get(i).getTitolo().equals(titolo)) {
					audio.get(i).alzaVolume();
					trovato=true;
					break;
					}
				if(trovato==false)
					System.out.println("Errore, non trovato");
				}
				else
					System.out.println("Non sono presenti audio");
				break;
			case 5:
				trovato=false;
				if(audio.size()!=0) {
					System.out.println("Inserire il titolo dell'audio di cui diminuire il volume");
					titolo=input.next();
					for(i=0;i<audio.size();i++)
					if(audio.get(i).getTitolo().equals(titolo)) {
						audio.get(i).abbassaVolume();
						trovato=true;
						break;
					}
					if(trovato==false)
						System.out.println("Errore, non trovato");
				}
				else
					System.out.println("Non sono presenti audio");
				break;
			case 6:
				trovato=false;
				if(audio.size()!=0) {
					System.out.println("Inserire il titolo dell'audio di cui mostrare le informazioni");
					titolo=input.next();
				for(i=0;i<audio.size();i++)
					if(audio.get(i).getTitolo().equals(titolo)) {
						audio.get(i).play();
						trovato=true;
						break;
					}
				if(trovato==false)
					System.out.println("Errore, non trovato");
				}
				else
					System.out.println("Non sono presenti audio");
				break;
			case 7:
				trovato=false;
				if(immagine.size()!=0) {
					System.out.println("Inserire il titolo dell'immagine da eliminare");
					titolo=input.next();
					for(i=0;i<audio.size();i++)
						if(immagine.get(i).getTitolo().equals(titolo)) {
							immagine.remove(i);
							trovato=true;
							break;
						}
					if(trovato==false)
						System.out.println("Errore, non trovato");
				}
					else
						System.out.println("Non sono presenti audio");
				break;
			case 8:
				trovato=false;
				if(audio.size()!=0) {
					System.out.println("Inserire il titolo dell'audio da eliminare");
					titolo=input.next();
					for(i=0;i<audio.size();i++)
						if(audio.get(i).getTitolo().equals(titolo)) {
							audio.remove(i);
							trovato=true;
							break;
						}
					if(trovato==false)
						System.out.println("Errore, non trovato");
				}
					else
						System.out.println("Non sono presenti audio");
				break;
			}
		}while(scelta!=9);
}
}
