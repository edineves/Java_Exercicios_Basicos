// Verifique se o numero digitado � par ou impar.

package cursoOnline;
import java.util.*;
public class verificarNumero {

	public static void main(String[] args) {
	int n;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Digite um n�mero inteiro: ");
	n = sc.nextInt( );
	if (n %2 == 0) {
		System.out.print("O n�mero digitado foi "+n+ " e � um n�mero par "); 
	}
	else  {
		System.out.print("O n�mero digitado foi "+n+ " e este � um n�mero impar ");
	   } 
	}
}
