// Fa�a uma escolha e mostre na tela a op��o selecionada.

package listaDeExercicios;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		int num;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero entre 0 e 5 ");
	num = sc.nextInt();
	
	switch (num) {
	case 0: System.out.println("Op��o 0 - ");break;
	case 1: System.out.print("Voce escolheu a op��o 1...");break;	
	
	default:System.out.print(" Op��o inv�lida, tente novamente.");
	}
	

	}

}
