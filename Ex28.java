/*- a porcentagem do IPI a ser acrescido no valor das pe�as - 
o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1 - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
 */
package listaDeExercicios;
import java.util.*;
public class Ex28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double valor, total;
		int qtd; 
	System.out.println("Digite a quantidade de pe�as ");
	qtd = sc.nextInt();
	
	System.out.println("Digite o valor unit�rio R$ ");
	valor = sc.nextFloat();
	
	total = (qtd * valor) * 1.04;
	
	System.out.println(total);
	
	}

}
