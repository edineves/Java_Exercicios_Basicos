//Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu antecessor e seu sucessor. 
package listaDeExercicios;
import java.util.*;
public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.print("Digite o n�mero ");
		num = sc.nextInt();
		
    System.out.print("Voc� digitou o n�mero " +num+ " e seu antecesso � " +(num-1)+ " e seu sucessor � "+(num+1));		
	}
}
