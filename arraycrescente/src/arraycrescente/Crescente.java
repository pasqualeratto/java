package arraycrescente;
import java.util.*;
class Crescente {
  public static void main(String[] args) {
    int array[]=new int[10],i,conta=0;
    Scanner inserimento=new Scanner(System.in);
    for(i=0;i<10;i++)
    array[i]=0;
    
    for(i=0;i<10;i++)
    array[i]=inserimento.nextInt();
    for(i=0;i<9;i++) {
      if(array[i]<array[i+1])
      conta++;
      else{
        System.out.println("L'array non è crescente");
        break;
      }
      if(conta==9)
      System.out.println("L'array  è crescente");
     }
    }
}