// ESCREVER DOIS NUMEROS E NO FINAL MOSTRAR O RESULTADOS DE TOSAS AS OPERA��ES 
package listaDeExercicios;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 float n1,n2,soma,subtracao,prod,div,resto;
	
	 System.out.println("Digite o primeiro n�mero ");
	 n1 = sc.nextFloat();
	 System.out.println("Digite o segundo n�mero ");
	 n2 = sc.nextFloat();
	 soma=(n1+n2); 
	 subtracao=(n1-n2); 
	 prod=(n1*n2); 
	 div=(n1/n2); 
	 resto=(n1%n2);
	 
	 System.out.printf("Os resultados entre n1 e n2 s�o: %.2f, %.2f, %.2f, %.2f ",+soma, +subtracao, +prod, +div, +resto);
	 
	}

}
