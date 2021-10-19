/*
 * Programa que receba um valor que foi depositado e exiba o valor
com rendimento após um mês.
Considere fixo o juro da poupança em 0.80% a.m.
 */
package listaDeExercicios;
import java.util.*;
public class Ec10 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 double saldo,valor;
	 
	 System.out.println("Digite o valor que possui em sua conta poupança R$ ");
	 valor = sc.nextFloat();
	 saldo = (valor * 1.080);
	 
	 System.out.printf("O saldo em sua conta poupança atualizado é R$ %.2f",+saldo);
	 
	}

}
