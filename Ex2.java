//PRODUTO ENTRE DOIS NUMEROS
package listaDeExercicios;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,prod;
	
	System.out.println("Digite um n�mero: ");
	a = sc.nextInt();
	System.out.println("Digite outro n�mero ");
	b = sc.nextInt();
	
	prod = (a*b);
	
	System.out.printf("O resultado entre " +a+ " x " +b+ " � igual a %s: ", +prod);
	

	}

}
