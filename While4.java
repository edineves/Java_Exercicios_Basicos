//Soma entre intervalo dos numeros digitados.

package listaDeExercicios;
import java.util.Scanner;
import java.utio.*;  //importar o scanner
public class While4 {

	public static void main(String[] args) {
	// classificar as váriaveis
	int a,b; 
	
	// chamar o scanner
	Scanner sc = new Scanner (System.in); 
	// entrada a
	System.out.print("Digite o primeiro número: "); 
	a = sc.nextInt();
	// entrada b
	System.out.print("Digite o segundo número: "); 
	b = sc.nextInt();
	//criar o contador.
	int i = a;
	int soma = a;	
	// condição 
	while ( i<b) {
		i=i+1;
		soma +=i;
	}
	// impressao do resultado 
	System.out.print("Soma é " +soma);
 }
}
