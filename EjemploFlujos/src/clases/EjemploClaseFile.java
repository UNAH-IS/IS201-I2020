package clases;

import java.io.File;
import java.io.IOException;

public class EjemploClaseFile {

	public static void main(String[] args) {
//		File archivo = new File("usuarios.txt");
//		System.out.println("Existe: "+archivo.exists());
//		if (!archivo.exists()) {
//			try {
//				archivo.createNewFile();
//				System.out.println("Se creo el archivo");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Absolute Path: "+archivo.getAbsolutePath());
//		System.out.println("Nombre: "+archivo.getName());
//		System.out.println("Padre: "+archivo.getParent());
//		System.out.println("Ruta: "+archivo.getPath());
//		System.out.println("Fecha de modificacion"+archivo.lastModified());
//		System.out.println("Tamaño: "+archivo.length());
//		System.out.println("Es archivo: "+archivo.isFile());
		
//		for (int i=0;i<20;i++) {
//			File archivo = new File("archivo"+i+".txt");
//			try {
//				archivo.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		File directorio = new File("directorio");
		directorio.mkdir();
		
	}

}
