// aqui será calculado e apresentada as informações. dos Diretores e dos funcionários da empresa
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
		d.setEndereco(" Rua São Joao, 555");
		d.setTelefone(98888887);
		saldir = d.salLiquido(10000.00f);
		// 2 - incluir dados do funcionario 
		f.setNome("Neves Soares ");
		f.setEndereco(" Av Boa Vista, 566");
		f.setTelefone(99965564);
		salfunc = f.salLiquido(5000.00f);
		
		//Imprimir dados do diretor.
		System.out.println("Dados do Diretor: "+d.getNome());
		System.out.println("Endereço: "+ d.getEndereco());
		System.out.println("Telefone: "+ d.getTelefone());
		System.out.println("Salário Liquido R$ "+ d.salLiquido(saldir));
		
		System.out.printf("\n");
		
		//Imprimir dados dos funcionários.
		System.out.println("Dados do Funcionário " + f.getNome());
		System.out.println("endereço: " + f.getEndereco());
		System.out.println("Telefone: " + f.getTelefone());
		System.out.println("Salário Liquido R$ " + f.salLiquido(salfunc));

	}
}
