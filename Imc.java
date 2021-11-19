package Imc;

public class Imc {
	
	private float peso;
	private float altura;
	private String nome;	
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float IMC (float alt, float pes ) {
		float imc;
		imc = pes/(alt*alt);
		return imc;
		
	}	

}
