/*
 *Fa�a um programa para ler o saldo atual do cliente , os d�bito e credito. Ap�s
 *os dados calcular e escrever o saldo atual ( saldo apos os lan�amentos).
 */
package listaDeExercicios;
import java.util.*;
public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float atual, deb, cred, total;
		
		System.out.println("Digite o SALDO ATUAL de sua conta R$ ");
		atual = sc.nextFloat();
		System.out.println("Digite o total de CR�DITOS do per�odo R$ ");
		cred = sc.nextFloat();
		System.out.println("Digite o total de D�BITOS R$ ");
		deb = sc.nextFloat();
		total = (atual+cred-deb);
		
		System.out.printf("Seu anterior era R$ %.2f ", +atual);
		System.out.printf("\nAp�s os lan�amentos seu saldo atual � R$ %.2f", +total);
		
	}

}
