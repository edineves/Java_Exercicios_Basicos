/*
 * Ler o ano de nascimento de uma pessoa
 * e informar se poder� votar ou n�o nas Elei��es de 2022 ,caso tenha mais de 16 anos.
 */
package listaDeExercicios;
import java.util.*;
public class Ex16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ano, apto;
	
	System.out.println("Digite o ano de seu nascimento: ");
	ano = sc.nextInt();
	apto = (2022 - ano);
	
	if (apto >= 16) {
		System.out.println("Voc� est� apto a votar nas pr�ximas Elei��s");
		}
	else {
		System.out.println("Voc� ainda n�o possui 16 anos para impress�o de seu Titulo de Eleitor.");
   }
	
  }
}
