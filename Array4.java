/*Usuario ira digitar 10 n�meros e o sistema ir� imprimir 
 * apenas os n�meros que est�o na POSI��O impar.
 */
package listaDeExercicios;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
	int [ ]numero = new int [10];
	int i;
	
	Scanner sc = new Scanner (System.in);
	
	for (i=0; i<10; i=i+1) {
		System.out.println("Digite um n�mero inteiro: ");
		numero[i] = sc.nextInt();				
	}
	for (i=0; i<10; i++) {
		if (i %2 != 0) {
			System.out.println(" n�mero na posi��o impar � " +numero[i]);
			System.out.println("A posi��o �: " +i);
		              }
                    }	
 }
}
