/*
 * Ler o raio de um circulo, calcular e escrever a sua
�rea. (pR�)
Calculo: �rea= PI*(raio�)  
 */
package listaDeExercicios;
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double raio, PI =3.14, area;
	
	System.out.println("Digite o raio do ciculo: ");
	raio = sc.nextFloat();
	area=(raio*raio)*PI;
	
	System.out.println("O raio do circulo �: "+area);
		
	}

}
