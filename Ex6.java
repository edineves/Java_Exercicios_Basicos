//Gasto de combustível por KM rodado.

package listaDeExercicios;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float km, li, consumo;
	
	System.out.println("Digite quantos KM o veiculo percorreu: ");
	km = sc.nextFloat();
	System.out.println("Quantos litros de combustível foram consumidos no trajeto: ");
	li = sc.nextFloat();
	
	consumo = (km/li);
	
	System.out.printf("Foram consumidos "+consumo+" de gasolina por KM percorrido. ");
	}
}
