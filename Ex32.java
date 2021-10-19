/*
 *
 */
package listaDeExercicios;
import java.util.*;
public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int segredo=1234, senha;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		if (senha == segredo) {
			System.out.println("Senha Correta");
		}
	    if (senha != segredo) {
			System.out.println("Senha Incorreta, digite novamente");
		}
		else if (senha != segredo) {
			System.exit (0);
		}
		
	}
}
