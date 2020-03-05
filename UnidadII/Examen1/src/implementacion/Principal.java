package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Grupo;
import clases.Usuario;

public class Principal {
	ArrayList<Grupo> grupos;
	ArrayList<Usuario> usuarios;
	int opcion;
	public Principal() {
		grupos = new ArrayList<Grupo>();
		usuarios = new ArrayList<Usuario>();
		
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Agregar Usuario (Agregar usuario al arraylist de usuarios)\n" + 
					"2. Agregar Grupo (Agregar grupo al arraylist de grupos, no solicitar los usuarios ni mensajes)\n" + 
					"3. Agregar Usuario a un grupo (Solicitar el indice del usuario y el indice del grupo para poder agregarlo)\n" + 
					"4. Agregar Mensaje (Solicitar el indice del grupo, el indice del usuario, el mensaje y la hora de publicacion)\n" + 
					"5. Mostrar Usuarios\n" + 
					"6. Mostrar Grupos\n" + 
					"7. Salir"));
			
			switch(opcion) {
			case 1:
				agregarUsuario();
				break;
			case 2:
				agregarGrupo();
				break;
			case 3:
				agregarUsuarioGrupo();
				break;
			case 4:
				agregarMensajeGrupo();
				break;
			case 5:
				mostrarUsuarios();
				break;
			case 6:
				mostrarGrupos();
				break;
			case 7:
				System.out.println("Bais");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
				
			}
		} while(opcion!=7);
	}
	
	public void agregarUsuario(){
	    System.out.println("Accion: agregarUsuario");
	}
	public void agregarGrupo(){
	    System.out.println("Accion: agregarGrupo");
	}
	public void agregarUsuarioGrupo(){
	    System.out.println("Accion: agregarUsuarioGrupo");
	}
	public void agregarMensajeGrupo(){
	    System.out.println("Accion: agregarMensajeGrupo");
	}
	public void mostrarUsuarios(){
	    System.out.println("Accion: mostrarUsuarios");
	}
	public void mostrarGrupos(){
	    System.out.println("Accion: mostrarGrupos");
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
