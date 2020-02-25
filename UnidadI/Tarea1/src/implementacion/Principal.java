package implementacion;

import clases.Archivo;
import clases.Fecha;
import clases.Usuario;

public class Principal {
	Fecha f;
	public Principal() {
//		do {
//			f = new Fecha(JOptionPane.showInputDialog("Ingrese la fecha"));
//		}while(!f.verificarFecha());
//		
//		System.out.println("La fecha ingresada es correcta");
//		System.out.println(f);
		Usuario usuarios[] = new Usuario[3];
		usuarios[0] = new Usuario("Pedro","pmartinez@gmail.com");
		usuarios[1] = new Usuario("Maria","mrodriguez@gmail.com");
		usuarios[2] = new Usuario("Luisa","llainez@gmail.com");
		
		
		Archivo archivo = new Archivo(
				"Tesis.docx", 
				23423,
				new Usuario("Juan","jperez@gmail.com"),
				usuarios,
				"Archivos de Tesis",
				new Fecha("12-12-2012"),
				new Fecha("12-12-2012")
		);
		
		System.out.println(archivo);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
