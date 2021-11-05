// Validação de senha com if
package listaDeExercicios;
import java.util.*;

public class While7 {

	public static void main(String[] args) {
		int senha = 1010;
		int segredo;
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digite a senha: ");
	segredo=sc.nextInt();
	
	while (segredo == senha) {
		System.out.println("OK"); break;
	}
	if (segredo != senha ) {
		
		System.out.println ("Senha Invalida Digite novamente");
	}
	}

}
