//Bloquear senha na terceira tentativa.
package listaDeExercicios;
import java.util.*;
public class If3 {

	public static void main(String[] args) {
		int segredo = 1010, senha;
		int cont = 0;
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite a senha: ");
	senha = sc.nextInt();
	
	if (senha == segredo) {
		System.out.println("Senha correta, prossiga a operação: ");
		
	}
	
	while ( senha != segredo && cont < 3) {		
		System.out.println("Digite novamente");
		senha = sc.nextInt();
		cont = cont+1;			
	if ( senha == segredo) {
		System.out.println("Senha correta");break;		
						   }	
	if (cont>=3) {
		System.out.print("Superou");
				 }	
        }
  }	
 }