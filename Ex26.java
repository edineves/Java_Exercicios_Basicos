/*Fazer um programa que imprima a m�dia aritm�tica de tres numeros digitados . A m�dia dos n�meros 4, 5 e 6. 
A soma das duas m�dias. A m�dia das m�dias. 
 */
package listaDeExercicios;
import java.util.*;
public class Ex26 {

	public static void main(String[] args) {
		int n1,n2,n3,media, soma, mediaT;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero ");
		n3 = sc.nextInt();
		
		media = (n1+n2+n3)/3;
		soma = (n1+n2+n3);
		mediaT = (media+soma)/2;
		
		System.out.printf("Os numeros digitados foram %d, %d e %d ",n1,n2,n3);
		System.out.println("A m�ida entre eles � " +media+ " e a soma � " +soma);
		
	}

}
