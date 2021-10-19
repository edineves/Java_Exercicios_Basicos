/*Fazer um programa que imprima a média aritmética de tres numeros digitados . A média dos números 4, 5 e 6. 
A soma das duas médias. A média das médias. 
 */
package listaDeExercicios;
import java.util.*;
public class Ex26 {

	public static void main(String[] args) {
		int n1,n2,n3,media, soma, mediaT;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número ");
		n3 = sc.nextInt();
		
		media = (n1+n2+n3)/3;
		soma = (n1+n2+n3);
		mediaT = (media+soma)/2;
		
		System.out.printf("Os numeros digitados foram %d, %d e %d ",n1,n2,n3);
		System.out.println("A méida entre eles é " +media+ " e a soma é " +soma);
		
	}

}
