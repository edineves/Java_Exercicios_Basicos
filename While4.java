//Soma entre intervalo dos numeros digitados.

package listaDeExercicios;
import java.util.Scanner;
import java.utio.*;  //importar o scanner
public class While4 {

	public static void main(String[] args) {
	// classificar as v�riaveis
	int a,b; 
	
	// chamar o scanner
	Scanner sc = new Scanner (System.in); 
	// entrada a
	System.out.print("Digite o primeiro n�mero: "); 
	a = sc.nextInt();
	// entrada b
	System.out.print("Digite o segundo n�mero: "); 
	b = sc.nextInt();
	//criar o contador.
	int i = a;
	int soma = a;	
	// condi��o 
	while ( i<b) {
		i=i+1;
		soma +=i;
	}
	// impressao do resultado 
	System.out.print("Soma � " +soma);
 }
}
