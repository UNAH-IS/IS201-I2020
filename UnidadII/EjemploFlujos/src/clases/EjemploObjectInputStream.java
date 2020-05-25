package clases;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjemploObjectInputStream {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream flujo = new ObjectInputStream(new FileInputStream("personas.data"));
			try {
				while (true) {
					Persona p = (Persona)flujo.readObject();
					System.out.println(p);
				}
			}catch(EOFException e) {
				//System.out.println("Fin del archivo");
			}
			flujo.close();
		
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
