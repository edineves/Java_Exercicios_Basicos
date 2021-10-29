// Laços de Repetições FOR 

package aula15;
import java.util.*;
public class Review2 {

	public static void main(String[] args) {
	int n,edi;
	int soma = 0;
	float media;
	
	Scanner sc = new Scanner(System.in);
		
	for (edi=0; edi<5; edi++) {
		System.out.println("Digite um número");
		n = sc.nextInt();
		soma = n + soma;
	}
	
	media = soma/5;
	System.out.println(media);
	
  }
}
