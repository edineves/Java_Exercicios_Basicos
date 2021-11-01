//TABUADA  - Divisão 
package listaDeExercicios;
import java.util.*;
public class For7 {

	public static void main(String[] args) {
	int n;
	int divisao;
	float resultado;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print( "Digite o numero da tabuada ");
	divisao = sc.nextInt();
	
	for(n=1 ; n<=10; n++) {
		resultado = (divisao/n);
		System.out.println( " "+ divisao + " / " + n + " = " +resultado);		
  }
 }
}
