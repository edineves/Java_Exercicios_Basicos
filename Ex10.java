	/*
	 * Uma loja est� vendendo seus produtos em 6 (seis)
	presta��es sem juros. Fa�a um programa que receba um valor de uma compra
	e mostre o valor das presta��es.
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
		
		System.out.printf("O produto adquirido custa "+ valor + " e poder� ser pago em at� seis parcelas de R$ %.2f",+prestacao );
		}
	
	}
