// digitar a nota e o sistema ir� informar se est� aprovaou ou reprovado.

package listaDeExercicios;
import java.util.*;

public class if2 {

	public static void main(String[] args) {
	int nota;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite a sua nota final: ");
	nota = sc.nextInt();
	
	if ( nota >= 5 && nota <7 ) {
		System.out.print("RECUPERA��O");
	}
	else if (nota >= 7 && nota <10) {
		System.out.print("APROVADO");
		
	}
	
	else 
			System.out.print("REPROVADO");
	
  }
}
