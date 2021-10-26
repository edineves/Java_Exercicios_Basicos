package cursoOnline;
import java.util.*;
public class NumeroDecrescente {

	public static void main(String[] args) {
	int n, i;
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite um número maior que 0 " );
		n=sc.nextInt();
		for (n= n ;n>=0 ;n=n-5) {
		
			System.out.print(" "  + n );
		}
	}

}
