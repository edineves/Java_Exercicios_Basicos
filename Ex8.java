/*
Escrever uma programa em que leia dois valores para as vari�veis A e B, e
efetuar as trocas dos valores de forma que a vari�vel A passe a possuir o valor
da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A. Apresentar
os valores trocados.  
 */

package listaDeExercicios;
import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	
	System.out.println("Digite o valor de A: ");
	b = sc.nextInt();
	System.out.println("Digite o valor para B: ");
	a = sc.nextInt();
	
	System.out.printf("O valor de A � " + a + " e o valor de B � " + b);
	
	}

}
