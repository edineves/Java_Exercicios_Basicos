package Exmplo3;

public class UsaPessoa {

	public static void main(String[] args) {
		Professor p1 = new Professor ();
		Aluno a1 = new Aluno ();
		
		p1.setNome("Cesar");
		p1.setSalario(5000.52f);
		a1.setNome("Edison Neves");
		a1.setNota(8.0f);
		
	System.out.println("Nome do Professor: " +p1.getNome());
	System.out.println("Seu salário é:" +p1.getSalario());
	System.out.println("Nome do Aluno: " + a1.getNome());
	System.out.println("A nota do aluno é: " + a1.getNota());		
		
	}

}
