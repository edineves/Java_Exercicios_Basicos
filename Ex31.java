/*Escreva um programa para ler 2 valores (considere que n�o ser�o informados valores 
 * iguais) e escrever o maior deles.  
 */
package listaDeExercicios;
import java.util.*;
public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int n1,n2;
		
		System.out.println("Digite o numero ");
		n1 = sc.nextInt();
		System.out.println("Digite outro n�mero ");
		n2 = sc.nextInt();
		
		if (n1>n2) {
			System.out.println("O primeiro n�mero � maior que o segundo ");
			}
		else {
			System.out.println("O segundo n�mero � maior que o primeiro");
		}
	}

}
