//TABUADA - Multiplicar.

package listaDeExercicios;
import java.util.*;
public class For4 {

	public static void main(String[] args) {
		int n;
		int tabuada;
				
	Scanner sc = new Scanner ( System.in);
	
	System.out.print("Digite a tabuada ");
	tabuada = sc.nextInt();
	
	for ( n=1; n<=10; n++) {
		
		System.out.print(" "+tabuada*n);		
   }	
  }
}
