/*
 * Entrar com dois n�meros e imprimir o menor n�mero, supondo que os n�meros
diferentes sejam diferentes.
 */
package listaDeExercicios;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1,n2;		
	System.out.println("Digite o primeiro numero desejado: ");
	n1 = sc.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	n2 = sc.nextInt();
	
	if (n1 < n2) {
		System.out.println("O numero " +n1+ " � menor que " +n2);
	}
	else {
		System.out.println("O n�mero � " +n1+ "� maior que ");
	}
	}
	
}
