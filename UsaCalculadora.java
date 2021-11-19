package Exemplo2;
import java.util.*;
public class UsaCalculadora {

	public static void main(String[] args) {
		int a1, b1, res;
		
		Scanner sc = new Scanner ( System.in );
		Calculadora calc = new Calculadora ();
		
		System.out.println("Digite o valor para A ");
		a1 = sc.nextInt();
		System.out.println("Digite o valor para B ");
		b1 = sc.nextInt();
		
		res = calc.soma(a1,b1);
		System.out.println( "A soma entre os números digitados é: "+ res);
		
		//calc.imprime();
	}
}
