// aqui ser� calculado e apresentada as informa��es. dos Diretores e dos funcion�rios da empresa
package Exemplo4;
import java.util.*;

public class UsaPessoas {
		//parametros.
	public static void main(String[] args) {
		Diretores d = new Diretores ();
		Funcionarios f = new Funcionarios ();
		float saldir, salfunc;
		
		// 1 - incluir os dados do Diretor.
		d.setNome("Edison Neves");
		d.setEndereco(" Rua S�o Joao, 555");
		d.setTelefone(98888887);
		saldir = d.salLiquido(10000.00f);
		// 2 - incluir dados do funcionario 
		f.setNome("Neves Soares ");
		f.setEndereco(" Av Boa Vista, 566");
		f.setTelefone(99965564);
		salfunc = f.salLiquido(5000.00f);
		
		//Imprimir dados do diretor.
		System.out.println("Dados do Diretor: "+d.getNome());
		System.out.println("Endere�o: "+ d.getEndereco());
		System.out.println("Telefone: "+ d.getTelefone());
		System.out.println("Sal�rio Liquido R$ "+ d.salLiquido(saldir));
		
		System.out.printf("\n");
		
		//Imprimir dados dos funcion�rios.
		System.out.println("Dados do Funcion�rio " + f.getNome());
		System.out.println("endere�o: " + f.getEndereco());
		System.out.println("Telefone: " + f.getTelefone());
		System.out.println("Sal�rio Liquido R$ " + f.salLiquido(salfunc));

	}
}
