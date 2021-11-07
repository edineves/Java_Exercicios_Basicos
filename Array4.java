/*Usuario ira digitar 10 números e o sistema irá imprimir 
 * apenas os números que estão na POSIÇÃO impar.
 */
package listaDeExercicios;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
	int [ ]numero = new int [10];
	int i;
	
	Scanner sc = new Scanner (System.in);
	
	for (i=0; i<10; i=i+1) {
		System.out.println("Digite um número inteiro: ");
		numero[i] = sc.nextInt();				
	}
	for (i=0; i<10; i++) {
		if (i %2 != 0) {
			System.out.println(" número na posição impar é " +numero[i]);
			System.out.println("A posição é: " +i);
		              }
                    }	
 }
}
