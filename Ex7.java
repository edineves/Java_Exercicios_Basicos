/*
 * Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o
total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o
seu nome, o sal�rio fixo e sal�rio no final do m�s.
		
*/
package listaDeExercicios;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String nome;
	float salario = 2500,vendas, com, total;	
	
	System.out.println("Bom Dia, digite o seu nome: ");
	nome = sc.next();
	System.out.println("Total de vendas ");
	vendas = sc.nextFloat();
	com = (vendas * 15)/100;
	total = (salario+com);
	
	System.out.printf("Seu sal�rio de R$" +salario+ " ser� acrescido de R$ " +com+ " totalizando R$ "+total);
	
	}

}
