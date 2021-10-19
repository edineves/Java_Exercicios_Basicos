/*Ler 3 valores representando as medidas dos lados de um triangulo e analisar se formam ou não a area do triangulo 
 */
package listaDeExercicios;
import java.util.*;
public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float l1,l2,l3,area;
		
		System.out.println("Digite a primeira medida ");
		l1 = sc.nextFloat();
		System.out.println("Digite a segunda medida do lado ");
		l2 = sc.nextFloat();
		System.out.println("Digite a terceira medida");
		l3 = sc.nextFloat();
		area = (l1*l2*l3);
		
		if (l1 >= l2+l3 || l2 >= l1+l3 || l3 >= l1+l2 ) {
			System.out.println("A área informada FORMA um TRIANGULO");
		}
		else {
			System.out.println("A área NÃO forma um TRIANGULO");
		}
	}

}
