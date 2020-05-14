package clases;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {

	public static void main(String[] args) {
		try {
			BufferedOutputStream flujo = new BufferedOutputStream(new FileOutputStream("archivo3.txt"));
			byte palabra[] = {72, 79, 76, 65};//HOLA
			String texto = " Juan";
			flujo.write(palabra);
			flujo.write(texto.getBytes());
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
