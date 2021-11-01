//faça a média de cinco numros digitados.

package listaDeExercicios;
import java.util.*;

public class For3 {

	public static void main(String[] args) {
		int n;
		int soma = 0;
		float media;
		
	Scanner sc = new Scanner (System.in);
		
	for (n=1; n<=5; n++) {
		System.out.println("Digite um número ");
		n = sc.nextInt();
		soma = n+soma;
		}
	
	media = (soma)/5;
		System.out.print("media = " +media);
 }
}

