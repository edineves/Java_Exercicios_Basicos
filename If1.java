// digitar um n�mero e o sistema ir� identificar se � negativo ou positivo 
package listaDeExercicios;
import java.util.*;
public class If1 {

	public static void main(String[] args) {
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero ");
	num = sc.nextInt();
	
	if (num > 0 ) {
		
		System.out.print("O n�mero digitado � " +num+ " e trata-se de um n�mero positivo");
		
		}
	
	else { 
		
		System.out.print(" O n�mero digitado foi " +num+ " e � um n�mero negativo");
		
  }
 }	
}