//Digitar dez números, e mostrar a quantidade de numeros negativos.
package listaDeExercicios;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		int [] num = new int [10];
		int cont = 0,soma = 0, i;
	Scanner sc = new Scanner(System.in);
	
	for(i=0; i<10 ;i++) {
		System.out.println("Digite um número inteiro: ");
		num [i] = sc.nextInt();		
	}
	
	for (i=0; i<10; i++) {
		if (num[i]<0) {
		cont++;		
		}
		
	System.out.println("Quantidade de números negativos digitados foram: " +cont);
	
	}
  }
}
