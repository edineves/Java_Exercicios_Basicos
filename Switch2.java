// Faça uma escolha e mostre na tela a opção selecionada.

package listaDeExercicios;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		int num;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero entre 0 e 5 ");
	num = sc.nextInt();
	
	switch (num) {
	case 0: System.out.println("Opção 0 - ");break;
	case 1: System.out.print("Voce escolheu a opção 1...");break;	
	
	default:System.out.print(" Opção inválida, tente novamente.");
	}
	

	}

}
