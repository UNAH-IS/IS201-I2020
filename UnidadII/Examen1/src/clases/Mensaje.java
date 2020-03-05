package clases;

public class Mensaje {
	private Usuario usuario;
	private String textoMensaje;
	private String hora;
	
	public Mensaje(Usuario usuario, String textoMensaje, String hora) {
		super();
		this.usuario = usuario;
		this.textoMensaje = textoMensaje;
		this.hora = hora;
	}
	
	public Mensaje() {}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Mensaje [usuario=" + usuario + ", textoMensaje=" + textoMensaje + ", hora=" + hora + "]";
	}

	public boolean verificarTexto() {
		return false;
	}
	public boolean verificarHora(){
		return false;
	}
}
