/*As maças custam 1.30 cada, se forem compras menos de uma duzia, 
 * fica com 1,00 se forem compradas 12. Escreva um programa que leia o numero de maças 
 * compras e calcule o valor a ser pago. 
 */
package listaDeExercicios;
import java.util.*;
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double qtd,vlr1,vlr2,pco,total;
		
		System.out.print("Digite a quantidade de maças que deseja comprar ");
		qtd = sc.nextDouble();		
		vlr1 = (qtd * 1.30);
		vlr2 = (qtd * 1);
		
		if (qtd < 12) {
			System.out.printf("Voce comprou "+qtd+ " maças e o total a pagar é R$ %.2f",+vlr1 );
		}
		else {
			System.out.printf("Voce comprou "+ qtd + " maças e o total a pagar é R$ %.2f",+vlr2 );
		}
		
	}

}
