// RESTO DA DIVIS�O ENTRE DOIS NUMEROS.

package listaDeExercicios;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float a,b,resto;
	
	System.out.println("Digite o n�mero a ser dividido ");
	a = sc.nextFloat();
	System.out.println("Digite o n�mero que ira dividir o primeiro ");
	b = sc.nextFloat();
	resto = (a%b);
	
	System.out.printf("O resto da Divis�o entre " +a+ " e " +b+ " � = %.3f ", +resto);
	
	}

}
