/*
 * Elaborar um programa que efetue a apresenta��o do valor da convers�o em
real (R$) de um valor lido em d�lar (US$). O algoritmo dever� solicitar o valor
da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o
usu�rio. 
 */

package listaDeExercicios;
import java.util.*;
public class Ex9 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	float real, dolar,valor;
	
	System.out.println("Digite a quantidade de Reais R$ ");
	real = sc.nextFloat();
	System.out.println("Digite a cota��o do dolar no dia ");
	dolar = sc.nextFloat();
	valor = (real / dolar);
	
	System.out.printf("O valor em R$ "+real+"com a cota��o em U$ "+dolar+" convertido em dolar � igual ao montante de U$ %.2f ",valor);		

	}

}
