//Programa que leia duas notas de um aluno e informe a condição conforme a media
package listaDeExercicios;
import java.util.*;
public class MediaNotas {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	float nota1, nota2, media;
	String aproveitamento = " ";
	
	System.out.println ("Digite sua primeira nota: ");
	nota1=sc.nextFloat();
	System.out.println ("Digite sua segunda nota: ");
	nota2=sc.nextFloat();
	media=(nota1+nota2)/2;
	
	if (media>=7 && media<=10) {
		aproveitamento= "A";
	}
	else if (media>=5 && media<7) {
		aproveitamento= "B";		
	}
	else {
	    aproveitamento=	"C";
	}
	
	switch (aproveitamento) {
	case "A": System.out.println(" APROVADO ");break;
	case "B": System.out.println("RECUPERAÇÃO");break;
	case "C": System.out.println("REPROVADO");break;
	
	default:
		System.out.println("Nota inválida");	
	}	
  }
}