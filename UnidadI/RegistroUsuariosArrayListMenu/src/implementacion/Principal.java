package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Usuario;
// Create Read Update Delete (CRUD)
public class Principal {
	int opcion=0;
	ArrayList<Usuario> usuarios;
	
	public Principal() {
		usuarios = new ArrayList<Usuario>();
		
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Agregar \n"
					+ "2. Actualizar\n"
					+ "3. Eliminar\n"
					+ "4. Mostrar Informacion\n"
					+ "0. Salir"
			));
			switch(opcion) {
			case 1:
				agregarUsuario();
				break;
			case 2:
				actualizarUsuario();
				break;
			case 3:
				eliminarUsuario();
				break;
			case 4:
				mostrarInformacion();
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
			}
		}while(opcion!=0);
	}
	
	public void agregarUsuario() {
		System.out.println("Agregar");
		Usuario usuario = new Usuario();
		usuario.setIdentidad(JOptionPane.showInputDialog("Identidad:"));
		usuario.setNombre(JOptionPane.showInputDialog("Nombre:"));
		usuario.setUsuario(JOptionPane.showInputDialog("Usuario:"));
		usuario.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:")));
		usuario.setGenero(JOptionPane.showInputDialog("Genero:"));
		usuarios.add(usuario);
	}
	
	public void actualizarUsuario() {
		System.out.println("Actualizar");
		int indiceModificar = 
			Integer.parseInt(JOptionPane.showInputDialog("¿Que elemento quiere modificar? [0-"+ (usuarios.size()-1) +"]"));
//		System.out.println("Objeto a actualizar: " + usuarios.get(indiceModificar));
		
		Usuario usuario = usuarios.get(indiceModificar);
		usuario.setIdentidad(JOptionPane.showInputDialog("Identidad:", usuario.getIdentidad()));
		usuario.setNombre(JOptionPane.showInputDialog("Nombre:", usuario.getNombre()));
		usuario.setUsuario(JOptionPane.showInputDialog("Usuario:", usuario.getUsuario()));
		usuario.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:",usuario.getEdad())));
		usuario.setGenero(JOptionPane.showInputDialog("Genero:", usuario.getGenero()));
		
	}
	
	public void eliminarUsuario() {
		System.out.println("Eliminar");
		int indiceEliminar = 
				Integer.parseInt(JOptionPane.showInputDialog("¿Que elemento quiere eliminar? [0-"+ (usuarios.size()-1) +"]"));
		usuarios.remove(indiceEliminar);
		JOptionPane.showMessageDialog(null, "Usuario eliminado");
	}
	
	public void mostrarInformacion() {
		System.out.println("Mostrar");
		String registros="";
		for(int i=0; i<usuarios.size();i++)
			registros += usuarios.get(i).toString() + "\n";
		
		JOptionPane.showMessageDialog(null, registros);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
