// digitar um número e o sistema irá identificar se é negativo ou positivo 
package listaDeExercicios;
import java.util.*;
public class If1 {

	public static void main(String[] args) {
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número ");
	num = sc.nextInt();
	
	if (num > 0 ) {
		
		System.out.print("O número digitado é " +num+ " e trata-se de um número positivo");
		
		}
	
	else { 
		
		System.out.print(" O número digitado foi " +num+ " e é um número negativo");
		
  }
 }	
}