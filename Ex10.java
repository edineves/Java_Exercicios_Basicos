	/*
	 * Uma loja está vendendo seus produtos em 6 (seis)
	prestações sem juros. Faça um programa que receba um valor de uma compra
	e mostre o valor das prestações.
	 */
	package listaDeExercicios;
	import java.util.*;
	public class Ex10 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float valor, prestacao;
		
		System.out.println("Digite o valor do produto R$ ");
		valor = sc.nextFloat();
		prestacao=(valor / 6);
		
		System.out.printf("O produto adquirido custa "+ valor + " e poderá ser pago em até seis parcelas de R$ %.2f",+prestacao );
		}
	
	}
