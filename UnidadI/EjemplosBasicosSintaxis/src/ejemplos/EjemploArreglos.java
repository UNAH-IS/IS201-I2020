package ejemplos;

public class EjemploArreglos {

	public static void main(String[] args) {
		int[] enteros = new int[5];
		enteros[0] = 20;
		enteros[1] = 30;
		enteros[2] = 54;
		enteros[3] = 65;
		enteros[4] = 776;
//		enteros[5] = 666; Error
		
		for(int i=0;i<enteros.length;i++) 
			System.out.println("Valor: " + enteros[i]);
		
		String cadenas[] = new String[3];
		cadenas[0] = "Hola";
		cadenas[1] = " ";
		cadenas[2] = "Mundo";
		
		for(int i=0;i<cadenas.length;i++)
			System.out.print(cadenas[i]);
		
		String cadenas2[] = {"Hola"," ","Mundo"};
		
//		tipoDato[] nombreArreglo = new tipoDato[tamaño];
	}

}
