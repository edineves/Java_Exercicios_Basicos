/*- a porcentagem do IPI a ser acrescido no valor das peças - 
o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
 */
package listaDeExercicios;
import java.util.*;
public class Ex28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double valor, total;
		int qtd; 
	System.out.println("Digite a quantidade de peças ");
	qtd = sc.nextInt();
	
	System.out.println("Digite o valor unitário R$ ");
	valor = sc.nextFloat();
	
	total = (qtd * valor) * 1.04;
	
	System.out.println(total);
	
	}

}
