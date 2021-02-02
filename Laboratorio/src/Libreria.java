import java.util.*;
public class Libreria {
private ArrayList<Libro> lista;

public boolean aggiungiLibro(String codice){
	boolean controllo=false;
	if(lista.size()!=0){
	for(int i=0;i<lista.size();i++)
		if(lista.get(i).getCodice().equals(codice))
			return false;
		else{
	lista.add(new Libro());
	return true;
		}}
	else{
		lista.add(new Libro());
		controllo=true;
	}
	return controllo;
}

public boolean prestLibro(String codice){
	
}

//implemento metodo controllo
}
