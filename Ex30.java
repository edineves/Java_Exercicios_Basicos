//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor. 
package listaDeExercicios;
import java.util.*;
public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.print("Digite o número ");
		num = sc.nextInt();
		
    System.out.print("Você digitou o número " +num+ " e seu antecesso é " +(num-1)+ " e seu sucessor é "+(num+1));		
	}
}
