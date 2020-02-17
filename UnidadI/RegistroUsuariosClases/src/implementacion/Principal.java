package implementacion;

import javax.swing.JOptionPane;

import clases.Usuario;

public class Principal {
	Usuario usuarios[];
	int cantidadUsuarios;
	public Principal() {
		cantidadUsuarios = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos usuarios quiere registrar?"));
		usuarios = new Usuario[cantidadUsuarios];//Aqui no se esta instanciando, solo se esta dando tamaño al arreglo de usuarios.
//		System.out.println("Cantidad elementos: " + usuarios.length);
		for(int i=0;i<usuarios.length;i++)
			solicitarInformacion(i); //0
		
		mostrarInformacion();
	}
	
	public void solicitarInformacion(int i) {
		Usuario usuario = new Usuario();
		usuario.setIdentidad(JOptionPane.showInputDialog("Identidad:"));
		usuario.setNombre(JOptionPane.showInputDialog("Nombre:"));
		usuario.setUsuario(JOptionPane.showInputDialog("Usuario:"));
		usuario.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
		usuario.setGenero(JOptionPane.showInputDialog("Genero:"));
		usuarios[i] = usuario;
	}
	
	public void mostrarInformacion() {
		for(int i=0; i<usuarios.length; i++)
			System.out.println(usuarios[i]);
	}
	
	public static void main(String[] args) {
		new Principal();//Objeto anonimo
	}

}
