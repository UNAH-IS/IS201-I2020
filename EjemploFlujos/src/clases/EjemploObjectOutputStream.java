package clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploObjectOutputStream {

	public static void main(String[] args) {
		Persona p1 = new Persona("Juan", "Perez",25);
		Persona p2 = new Persona("Pedro", "Rogriguez",25);
		try {
			ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream("personas.data"));
			flujo.writeObject(p1);
			flujo.writeObject(p2);
			flujo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
