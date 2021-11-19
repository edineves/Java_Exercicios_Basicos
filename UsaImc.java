package Imc;

public class UsaImc {

	public static void main(String[] args) {
	
		Imc p1 = new Imc ();
		float resImc;
		
		p1.setNome("Edison Neves");
		p1.setPeso(77.3f);
		p1.setAltura(1.70f);
		
		resImc = p1.IMC(p1.getAltura(), p1.getPeso());

		System.out.println("O IMC do paciente " +p1.getNome()+" é :");
		System.out.println(resImc);
	}
}
