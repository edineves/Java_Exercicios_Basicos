// Tabuada da Soma

package listaDeExercicios;
import java.util.*;
public class For5 {

	public static void main(String[] args) {
	int n;
	int soma;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o numero ser somado: " );
	soma = sc.nextInt();
	
	for (n=0; n<=10; n++) {
		
		System.out.println( " "+ soma + " + " +n+ " = " +(soma+n));	
		
	}
	
	}
	
}

