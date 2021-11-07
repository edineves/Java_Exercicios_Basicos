//Guardar as notas de um aluno e fazer a média.
package listaDeExercicios;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		float[] aluno1 = new float[3];
		int i;
		float soma=0, media=0;		
		
	Scanner sc = new Scanner(System.in);
	
	for (i=0;i<3;i++) {
		System.out.println("Digite a nota");
		aluno1[i] = sc.nextFloat();
		}
	
	for ( i=0;i<3;i++) {
		soma = aluno1[i]+soma;
	}
	
	media = soma/3;
	System.out.print("A média das notas do aluno é: " +media);
 }
}