public class Automobile {
	private String modello,marca;
	private int anno,potenza;
	
	public Automobile(){
	  this.anno=2020;
	  this.potenza=0;
	  this.marca="";
	  this.modello="";
	}
  
	public void setAnno(int a)
	{
	 this.anno=a;
	}
	
	public void setPotenza(int a)
	{
	 this.potenza=a;
	}
	
	public void setModello(String a)
	{
	 this.modello=a;
	}
	
	public void setMarca(String a)
	{
	 this.marca=a;
	}
	
	public int getAnno()
	{
	 return this.anno;
	}
	
	public int getPotenza()
	{
	 return this.potenza;
	}
	
	public String getModello()
	{
	 return this.modello;
	}
	
	public String getMarca()
	{
	 return this.marca;
	}
	
	/*public static void main(String[] Args) {
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
 }*/
}
