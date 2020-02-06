package ejemplos;

import java.util.Scanner;

//import java.util.Scanner;
//import java.lang.*; //Este paquete se importa por defecto 


public class EjemploScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int a;
		int b;
		int suma;
		
		System.out.print("¿Cual es su nombre?: ");
		nombre = entrada.nextLine();//Next recibe texto
		System.out.print("Ingrese un numero: ");
		a = entrada.nextInt();
		System.out.print("Ingrese otro numero: ");
		b = entrada.nextInt();
		suma = a + b;
		System.out.print("Hola " + nombre + ", la suma de los numeros que ingreso es: " + suma);
		entrada.close();
	}

}
