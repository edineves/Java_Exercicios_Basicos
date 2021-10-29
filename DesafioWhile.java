package cursoOnline;
import java.util.*;
public class DesafioWhile {
	
	public static void main(String[] args) {
	int qtdnota = 0;
	double nota=0, total=0;
	double media;
	
	Scanner sc = new Scanner(System.in);
	
    while (nota != -1) {
    	System.out.println("Digite a nota ");
    	nota = sc.nextDouble();
    if (nota <=10 && nota >=0) {
    	total += nota; qtdnota++;
      }
    }
    media = total/qtdnota;
    System.out.println("A média das notas é: " +media);
  }
}
