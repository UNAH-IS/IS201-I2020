package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Carrera;
import clases.Usuario;
// Create Read Update Delete (CRUD)
public class Principal {
	int opcion=0;
	ArrayList<Usuario> usuarios;
	ArrayList<Carrera> carreras;
	
	public Principal() {
		usuarios = new ArrayList<Usuario>();
		carreras = new ArrayList<Carrera>();
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Agregar \n"
					+ "2. Actualizar\n"
					+ "3. Eliminar\n"
					+ "4. Mostrar Informacion\n"
					+ "-------------------\n"
					+ "5. Agregar Carrera\n"
					+ "6. Mostrar Carreras\n"
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
				mostrarUsuarios();
				break;
			case 5:
				agregarCarrera();
				break;
			case 6:
				mostrarCarreras();
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
		
		//Preguntar al usuario a que carrera pertenece, de la lista de carreras
		int indiceCarrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice de la carrera a la que pertenece"));
		usuario.setCarrera(carreras.get(indiceCarrera));
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
	
	public void mostrarUsuarios() {
		System.out.println("Mostrar");
		String registros="";
		for(int i=0; i<usuarios.size();i++)
			registros += usuarios.get(i).toString() + "\n";
		
		JOptionPane.showMessageDialog(null, registros);
	}
	
	public void agregarCarrera() {
		Carrera carrera = new Carrera();
		carrera.setCodigoCarrera(Integer.parseInt(JOptionPane.showInputDialog("Codigo Carrera:")));
		carrera.setNombreCarrera(JOptionPane.showInputDialog("Nombre Carrera:"));
		carrera.setCantidadAsignaturas(Integer.parseInt(JOptionPane.showInputDialog("Cantidad Asignaturas:")));
		carreras.add(carrera);
	}
	
	public void mostrarCarreras() {
		System.out.println("Mostrar");
		String registros="";
		for(int i=0; i<carreras.size();i++)
			registros += carreras.get(i).toString() + "\n";
		
		JOptionPane.showMessageDialog(null, registros);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
