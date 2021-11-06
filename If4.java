//faça um programa que peça a senha e matricula do usuario e 
//efetue o bloqueio apos a terceira tentativa.

package listaDeExercicios;
import java.util.*;
public class If4 {

	public static void main(String[] args) {
		int codigo = 1010, senha;
		int matricula = 381462, usuario;
		int cont = 0;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite sua matricula");
	usuario = sc.nextInt();
	System.out.print("Digite sua senha");
	senha = sc.nextInt();
	
	if (senha == codigo && usuario == matricula) {
		System.out.print("Acesso ao sistema liberado: ");
	}
	while ( senha != codigo || usuario != matricula) {
		System.out.println(" Dados inválidos: ");
		System.out.print(" Digite sua matricula novamente ");
		usuario = sc.nextInt();
		System.out.print(" Digite sua senha novamente ");
		senha = sc.nextInt();
		cont++;
		
		if (cont==3) {
			System.out.println("Bloqueio");break;
		     }
		
		  if (senha == codigo && usuario == matricula) {
			  System.out.println("Acesso Liberado");
			  
	         }
   }
 }
}
