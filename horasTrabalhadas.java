//Calculo das horas trabalhadas.

package listaDeExercicios;
import java.util.*;
public class horasTrabalhadas {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float valorHora,salario;
	int   hora;
	
	System.out.println("Digie o valor por hora trabalhada R$ ");
	valorHora = sc.nextFloat();
		
	System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
	hora = sc.nextInt();
	
	salario = (hora*valorHora);
	System.out.println("O salario a ser creditado em sua conta será R$ " +salario);
	}
}
