//Logar no sistema com uma senha definida, enquanto nao acertar � preciso repetir a opera��o.

package listaDeExercicios;
import java.util.*;
public class While6 {
	
	public static void main(String[] args) {

		int segredo = 1234, senha;
	Scanner sc = new Scanner ( System.in );
	
	System.out.println("Digite a senha");		
	senha = sc.nextInt();	
		
	while (senha != segredo  ) {		
		System.out.print("Senha invalida, digite novamente");		
	}
	
		System.out.println("Senha Correta");
		
 }
}
