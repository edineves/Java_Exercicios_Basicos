//Digitar um intervalo de numeros e imprmir este intervado de 5 em 5.

package listaDeExercicios;
import java.util.*;
public class Ex23 {

	public static void main(String[] args) {
		int soma = 0;
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero ");
		a = sc.nextInt();		
		System.out.println("Digite o segundo n�mero ");
		b = sc.nextInt();
		
		for (a=0; a<=b; a += 5) {
			soma = soma + a;
			System.out.println(a);
		}	
	}
}