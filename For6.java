package listaDeExercicios;
import java.util.*;
public class For6 {

	public static void main(String[] args) {
	int n;
	int subtracao;

	Scanner sc = new Scanner (System.in);
	
	System.out.print("Digite um número da tabuada: ");
	subtracao = sc.nextInt();
	
	for (n=0; n<=10; n++) {
		
		System.out.println( " "+ subtracao + " - " +n+ " = " +(subtracao - n));
	}
  }
}
