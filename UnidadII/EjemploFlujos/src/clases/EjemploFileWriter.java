package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {

	public static void main(String[] args) {
		BufferedWriter flujo;
		try {
			flujo = new BufferedWriter(new FileWriter("arhivo2.txt",true));
			flujo.newLine();
			flujo.write("Escribiendo archivo desde java");
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
