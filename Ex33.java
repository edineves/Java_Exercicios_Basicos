/*Escreva um programa para ler 3 valores inteiros 
 * (considere que n�o ser�o lidos valores iguais) e 
 * escrev�-los em ordem crescente
 * 
 */
package listaDeExercicios;
import java.util.*;
public class Ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite um n�mero ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero ");
		n2 = sc.nextInt();
		System.out.println("Digite o �ltimo n�mero ");
		n3 = sc.nextInt();
		
		if (n1<n2 && n2<n3) { 
			System.out.println(+n1+,+n2+,+n3);
		}
		
	}

}
