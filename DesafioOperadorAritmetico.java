package cursoOnline;
import java.util.*;
public class DesafioOperadorAritmetico {

	public static void main(String[] args) {
	int a,a1,b,c,d,e,f,desafio; 

	a = (6*(3+2));
	a1 = (int)Math.pow(a,2);
	b = a1/(3*2);
	System.out.println(b);
	
	c = ((1-5)*(2-7))/2;
	d = (int)Math.pow(c,2);
	System.out.println(d);
	
	e = (int)Math.pow(b-d,3);
	System.out.println(e);
	
	desafio = (e)/(int)Math.pow(10,3);
	System.out.println(desafio);
	
 }
}
