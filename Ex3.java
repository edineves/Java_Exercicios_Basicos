package listaDeExercicios;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a, b, div;
	
	System.out.println("Digite o primeiro n�mero: ");
	a = sc.nextInt();
	System.out.println("Digite o segundo n�mero ");
	b = sc.nextInt();
	div = a/b;
	
	System.out.printf("O resultado da Divis�o entre " +a+ " e " +b+ " � igual a : %d ", +div);
	
	}

}
