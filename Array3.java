//Digite dez numeros e os numeros pares substituir por 0.
// assim o sistema indicará quais numeros são pares ao usuario eliminando-os.
package listaDeExercicios;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
	int i;
	int []matriz = new int [10];
	
	Scanner sc = new Scanner ( System.in);
	
	for (i=0; i<10; i++) {
	  	System.out.print("Digite um número >>> ");
	  	matriz [i] = sc.nextInt();	    	
		}
	
	for ( i=0; i<10; i++) {
		System.out.print(" " +matriz[i]);
		}
	
	for ( i=0; i<10; i++) {
		if (matriz [i] % 2 ==0 ) {
			matriz [i] = 0;
	System.out.printf( " " +matriz[i]);
		}
		
		else {
			System.out.println("-" +matriz [i]);
		}
   }	
  }
}
