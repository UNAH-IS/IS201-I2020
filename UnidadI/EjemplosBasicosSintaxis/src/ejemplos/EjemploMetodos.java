package ejemplos;

public class EjemploMetodos {
	static int z = 100;
	static int sumar(int a, int b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Suma: " + sumar(5,6));
		int x = 4;
		int y = 5;
		final int ALTURA_MAXIMA = 666;
		System.out.println(x+y);
		System.out.println(z);
	}

}
