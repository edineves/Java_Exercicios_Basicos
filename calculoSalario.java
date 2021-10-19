/*Calcular o salario por meio das horas trabalhads e 
 * descontar os impostos na fonte. 
 */
package listaDeExercicios;
import java.util.*;
public class calculoSalario {

	public static void main(String[] args) {
	double vlrhora,inss,ir,salario,desconto,hrtrab,liquido,sindicato,descontos;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor por hora trabalhada: R$ ");
	vlrhora = sc.nextDouble();	
	System.out.println("Digite quantas horas de trabalho no mês: ");
	hrtrab = sc.nextDouble();
	
	salario = vlrhora * hrtrab;
	inss = (salario * 0.08);
	ir = (salario * 0.11);
	sindicato = (salario * 0.05); 
	descontos = (inss + sindicato + ir);
	liquido = salario - descontos;
	
	System.out.println("Seu salario Bruto é R$ " +salario);
	System.out.println("Total de descontos "+descontos);
	System.out.println("Seu salário Liquido é de R$ " +liquido);			
  }
}
