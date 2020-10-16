
public class TestAutomobile {
	public static void main(String[] Args) {
	   	 Automobile a1;
		  a1=new Automobile();
		  a1.setAnno(2020);
		  a1.setPotenza(300);
		  a1.setModello("A1");
		  a1.setMarca("Audi");
	   	 System.out.println(a1.getAnno());
	   	 System.out.println(a1.getPotenza());
	   	 System.out.println(a1.getModello());
	   	 System.out.print(a1.getMarca());
	 }

}
