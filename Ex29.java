/*Crie um algoritmo que leia o valor do sal�rio m�nimo e o 
  valor do sal�rio de um usu�rio, calcule a quantidade de 
 sal�rios m�nimos esse usu�rio ganha e imprima o resultado. 
  (1SM=R$788,00) 
  */
package listaDeExercicios;
import java.util.*;
public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float sala, novoSal, salaMin = 788;
				
	System.out.println("Digite o valor de seu sal�rio R$ ");
	sala = sc.nextFloat();
	
	System.out.println("O seu sal�rio representa " +(sala/788)+" sal�rios m�nimos");

	}

}
