package clases;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EjemploInputStream {

	public static void main(String[] args) {
		try {
			BufferedInputStream flujo = new BufferedInputStream(new FileInputStream("archivo.txt"));
			int a;
			while((a = flujo.read())!=-1) {
				System.out.print((char)a);
			}
			
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
