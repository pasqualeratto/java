package orarioP;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orario o1, o2;
		o1=new Orario();
		o2=new Orario(13, 5, 9);
		System.out.println(o2.getOra()+" "+o2.getMin()+" "+o2.getSec());
/*		o1.min=19;
		System.out.print(o1.min);*/
		o2.setMin(19);
//		System.out.println(o1.getMin());
//		System.out.println(o1.getOra()+" "+o1.getMin()+" "+o1.getSec());
		System.out.println(o2.getOra()+" "+o2.getMin()+" "+o2.getSec());

		Orario o3;
		//Ho fatto in modo che 02 ed o3 contengano lo stesso riferimento
		//Qualunque modifica sull'attributo di uno dei due oggetti abbia come effetto
		//collaterale la modifica anche sull'attributo dell'altro oggetto.
		//Questo perchè o2 ed o3 sono puntatori contenenti lo stesso indirizzo
		//ossia puntano allo stesso oggetto nella heap.
		//o3=o2;
		//o3.setOra(12);
		//System.out.println(o2.getOra());
		//Se adesso io volessi creare un clone dell'oggetto o3
		//ma che sia indipendente da esso devo usare il costruttore copia
		o3=new Orario(o2);
		System.out.println(o3.getOra()+" "+o3.getMin()+" "+o3.getSec());
		o3.setOra(12);
		System.out.println("Ora contenuta in o2: "+o2.getOra());
		System.out.println("Ora contenuta in o3: "+o3.getOra());
		System.out.println(o2.getOra());
	
	}

}
