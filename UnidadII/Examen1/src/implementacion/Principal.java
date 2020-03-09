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
				JOptionPane.showMessageDialog(null, mostrarUsuarios());
				break;
			case 6:
				JOptionPane.showMessageDialog(null, mostrarGrupos());
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
	    Usuario usuario = new Usuario();
	    usuario.setNombre(JOptionPane.showInputDialog("Nombre:"));
	    usuario.setApellido(JOptionPane.showInputDialog("Apellido:"));
	    usuario.setCorreo(JOptionPane.showInputDialog("Correo:"));
	    usuario.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:")));
	    usuarios.add(usuario);
	}
	public void agregarGrupo(){
	    System.out.println("Accion: agregarGrupo");
	    Grupo grupo = new Grupo();
	    grupo.setNombreGrupo(JOptionPane.showInputDialog("Nombre Grupo"));
	    grupo.setFechaCreacion(JOptionPane.showInputDialog("Fecha de creación"));
	    grupos.add(grupo);
	}
	public void agregarUsuarioGrupo(){
	    System.out.println("Accion: agregarUsuarioGrupo");
	    int indiceGrupoSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("¿A que grupo desea agregar usuarios?\n" + mostrarGrupos()));
	    int indiceUsuarioSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("¿Que usuario desea agregar al grupo "+indiceGrupoSeleccionado+"?\n" + mostrarUsuarios() ));
	    Grupo grupoSeleccionado = grupos.get(indiceGrupoSeleccionado);
	    Usuario usuarioSeleccionado = usuarios.get(indiceUsuarioSeleccionado);
	    grupoSeleccionado.getUsuariosGrupo().add(usuarioSeleccionado);
	    
	}
	public void agregarMensajeGrupo(){
	    System.out.println("Accion: agregarMensajeGrupo");
	}
	public String mostrarUsuarios(){
	    System.out.println("Accion: mostrarUsuarios");
	    String resultado = "";
	    for(int i=0; i<usuarios.size();i++)
	    	resultado+= i + " " +usuarios.get(i) + "\n";
	    	
	    return resultado;
	}
	public String mostrarGrupos(){
	    System.out.println("Accion: mostrarGrupos");
	    String resultado = "";
	    for(int i=0; i<grupos.size();i++)
	    	resultado+= i + " " + grupos.get(i)  + "\n";
	    	
	    return resultado;
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
