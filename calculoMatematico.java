//Inserir dois numeros inteiros e um numero real para calculos
package listaDeExercicios;
import java.util.*;
public class calculoMatematico {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1,n2,a;
	double n3,b,c;
	
	System.out.println("Digite o primeiro n�mero: ");
	n1 = sc.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	n2 = sc.nextInt();
	System.out.println("Digite um n�mero real: ");
	n3 = sc.nextDouble();
	
	a = (n1*2)/(n2/2);
	b = (n1*3) + n3;
	c = Math.pow (n3,3);
	
	System.out.println("Resultado a = " +a);
	System.out.println("Resultado b = " +b);
	System.out.println("Resultado c = " +c);
	}
  }
