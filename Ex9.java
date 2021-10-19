/*
 * Elaborar um programa que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário. 
 */

package listaDeExercicios;
import java.util.*;
public class Ex9 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	float real, dolar,valor;
	
	System.out.println("Digite a quantidade de Reais R$ ");
	real = sc.nextFloat();
	System.out.println("Digite a cotação do dolar no dia ");
	dolar = sc.nextFloat();
	valor = (real / dolar);
	
	System.out.printf("O valor em R$ "+real+"com a cotação em U$ "+dolar+" convertido em dolar é igual ao montante de U$ %.2f ",valor);		

	}

}
