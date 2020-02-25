package clases;

import java.util.Arrays;

public class Archivo {
	private String nombre;
	private int tamanioBytes;
	private Usuario usuarioSubio;
	private Usuario usuarios[];//private ArrayList<Usuario> usuarios;
	private String nombreCarpeta;
	private Fecha fechaModificacion;
	private Fecha fechaSubida;
			
	public Archivo(String nombre, int tamanioBytes, Usuario usuarioSubio, Usuario[] usuarios, String nombreCarpeta,
			Fecha fechaModificacion, Fecha fechaSubida) {
		this.nombre = nombre;
		this.tamanioBytes = tamanioBytes;
		this.usuarioSubio = usuarioSubio;
		this.usuarios = usuarios;
		this.nombreCarpeta = nombreCarpeta;
		this.fechaModificacion = fechaModificacion;
		this.fechaSubida = fechaSubida;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTamanioBytes() {
		return tamanioBytes;
	}


	public void setTamanioBytes(int tamanioBytes) {
		this.tamanioBytes = tamanioBytes;
	}


	public Usuario getUsuarioSubio() {
		return usuarioSubio;
	}


	public void setUsuarioSubio(Usuario usuarioSubio) {
		this.usuarioSubio = usuarioSubio;
	}


	public Usuario[] getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}


	public String getNombreCarpeta() {
		return nombreCarpeta;
	}


	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}


	public Fecha getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Fecha fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public Fecha getFechaSubida() {
		return fechaSubida;
	}


	public void setFechaSubida(Fecha fechaSubida) {
		this.fechaSubida = fechaSubida;
	}
	
	

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", tamanioBytes=" + tamanioBytes + ", usuarioSubio=" + usuarioSubio
				+ ", usuarios=" + Arrays.toString(usuarios) + ", nombreCarpeta=" + nombreCarpeta
				+ ", fechaModificacion=" + fechaModificacion + ", fechaSubida=" + fechaSubida + "]";
	}


	public boolean verificarTamanio() {
		return false;
	}
	public boolean verificarExtension(){
		return false;
	}
	public boolean verificarUsuarios(){
		return false;
	}
}
