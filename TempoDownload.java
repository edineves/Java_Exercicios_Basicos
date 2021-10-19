//Ler o tamanho de um arquivo e calcular o tempo de Download.
package listaDeExercicios;
import java.util.*;
public class TempoDownload {
	public static void main(String[] args) {
	double tamArquivo, velInternet,tempo;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o tamanho do arquivo ");
	tamArquivo = sc.nextDouble();	
	System.out.println("Digite a velocidade da internet ");
	velInternet = sc.nextDouble();
	tempo = tamArquivo*velInternet;
	
	System.out.println("O tempo de download é aproximadamente "+tempo);
	}
}
