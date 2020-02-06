package ejemplos;

public class DemoCaracteresEscape {

	public static void main(String[] args) {
		String cadena = "Hola Munde";
		System.out.println("Linea 1\nLinea 2");
		System.out.println("\tLinea con tabulacion");
		System.out.println("\"Texto entre comillas\"");
		System.out.println("\'Texto entre\\ comillas simples\'");
		
		System.out.println("Tamaño de la cadena: " + cadena.length());
		System.out.println("Posición del texto: la, " + cadena.indexOf("la"));
		System.out.println("Ultima aparición de la letra o " + cadena.lastIndexOf("o"));
		System.out.println("Caracter de la posición 3: " + cadena.charAt(3));
		System.out.println(cadena.substring(0,4));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		if (cadena.equals("Hola Mundo")) {
			System.out.println("Las cadenas son iguales");
		}
		String cadena2="    Hola mundo     ";
		System.out.println(cadena2.trim());
		System.out.println(cadena.contains("Mun"));
	}

}
