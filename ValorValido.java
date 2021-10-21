//Digitar uma nota  e pedir ate que seja válida

package listaDeExercicios;
import java.util.*;
public class ValorValido {
	public static void main(String[] args) {
	int nota;
	boolean notaValida = false;	
	Scanner sc = new Scanner(System.in);
	
	do  {		
	System.out.println("Digite uma nota entre  0 e 10 .");
	nota = sc.nextInt();
		
	if (nota==8) {
		notaValida = true;
		System.out.println("A nota que vc digitou está correnta "+nota);
	}else {
		System.out.println("A nota nao está correta, digite novamente ");
    } 
	
	    }while (notaValida == false);
 }
}

