/*
 * Um programa que receba o pre�o de custo de um produto e mostre o
valor de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de
acordo com um percentual informado pelo usu�rio. 
 */
package listaDeExercicios;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float custo, venda,novoPreco;
	
	System.out.println("Digite o valor da mercadoria ");
	custo = sc.nextFloat();
	System.out.println("Digite o percentual sobre a venda ");
	venda = sc.nextFloat();
	novoPreco = (custo * venda)/100+custo;
	
	System.out.print("O percentual sobre a venda � "+venda+" %");
	System.out.print("e o valor passa a ser R$ " +novoPreco);
	
	}

}
