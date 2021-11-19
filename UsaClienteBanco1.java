package ClienteBanco1;

public class UsaClienteBanco1 {

	public static void main(String[] args) {
		
		ClienteBanco1 Edison = new ClienteBanco1();
		
		Edison.setNome(" Edison Neves ");
		Edison.setTelefone(998989833);
		Edison.setEndereco("Rua Sao Joao, 4556");
		
		System.out.println("Nome do cliente é " + Edison.getNome());
		System.out.println("Telefone do cliente é " + Edison.getTelefone());
		System.out.println("O endereço do cliente é " + Edison.getEndereco());
		
		
	}

}
