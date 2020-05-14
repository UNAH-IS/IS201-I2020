package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {

	public static void main(String[] args) {
		try {
			BufferedReader flujo = new BufferedReader(new FileReader("archivo.txt"));
			String linea = "";
			while((linea = flujo.readLine())!=null) {
				System.out.println(linea);
			}
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
