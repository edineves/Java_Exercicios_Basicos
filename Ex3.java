package listaDeExercicios;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a, b, div;
	
	System.out.println("Digite o primeiro número: ");
	a = sc.nextInt();
	System.out.println("Digite o segundo número ");
	b = sc.nextInt();
	div = a/b;
	
	System.out.printf("O resultado da Divisão entre " +a+ " e " +b+ " é igual a : %d ", +div);
	
	}

}
