package clases;

import java.util.ArrayList;

public class Grupo {
	private String nombreGrupo;
	private String fechaCreacion;
	private ArrayList<Usuario> usuariosGrupo;
	private ArrayList<Mensaje> mensajes;
	public Grupo(String nombreGrupo, String fechaCreacion, ArrayList<Usuario> usuariosGrupo,
			ArrayList<Mensaje> mensajes) {
		super();
		this.nombreGrupo = nombreGrupo;
		this.fechaCreacion = fechaCreacion;
		this.usuariosGrupo = usuariosGrupo;
		this.mensajes = mensajes;
	}
	
	public Grupo() {}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setUsuariosGrupo(ArrayList<Usuario> usuariosGrupo) {
		this.usuariosGrupo = usuariosGrupo;
	}

	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public ArrayList<Usuario> getUsuariosGrupo() {
		return usuariosGrupo;
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	@Override
	public String toString() {
		return "Grupo [nombreGrupo=" + nombreGrupo + ", fechaCreacion=" + fechaCreacion + ", usuariosGrupo="
				+ usuariosGrupo + ", mensajes=" + mensajes + "]";
	}
}
