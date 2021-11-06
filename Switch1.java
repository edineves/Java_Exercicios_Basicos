// Digite um numero entre 1 e 7 para validar o dia da semana.
package listaDeExercicios;
import java.util.*;
public class Switch1 {

	public static void main(String[] args) {
	int opcao;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Digite a opção ente 1 e 7 ");
	opcao = sc.nextInt();
	
	switch (opcao) {
	case 1: System.out.print("Domingo"); break;
	case 2: System.out.print("Segunda - feira "); break;
	case 3: System.out.print("Terça - feira "); break;
	case 4: System.out.print("Quarta - feira "); break;
	case 5: System.out.print("Quinta - feira "); break;
	case 6: System.out.print("Sexta - feira "); break;
	case 7: System.out.print("Sabado "); break;
	
	default :System.out.print("Opção inválida");
				}
  }
}
