// Verifique se o numero digitado é par ou impar.

package cursoOnline;
import java.util.*;
public class verificarNumero {

	public static void main(String[] args) {
	int n;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Digite um número inteiro: ");
	n = sc.nextInt( );
	if (n %2 == 0) {
		System.out.print("O número digitado foi "+n+ " e é um número par "); 
	}
	else  {
		System.out.print("O número digitado foi "+n+ " e este é um número impar ");
	   } 
	}
}
