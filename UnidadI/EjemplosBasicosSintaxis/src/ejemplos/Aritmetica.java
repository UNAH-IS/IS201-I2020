package ejemplos;

public class Aritmetica {//UpperCamelcase
	public static void main(String[] args){
		int a      = 12;
		int b      = 10;
		int suma   = a + b;//lowerCamelCase
		int resta  = a - b;
		int mult   = a * b;
		float div  = (float)a / (float)b;
		int modulo = a % b;
		
		final int ALTURA_MAXIMA = 100; //UPPER SNAKE		
 
		System.out.print("Suma :");
		System.out.println(suma );
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);
	}

}
