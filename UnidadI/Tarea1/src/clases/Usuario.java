package clases;

public class Usuario {
	private String nombreUsuario;
	private String correoElectronico;
	
	public Usuario(String nombreUsuario, String correoElectronico) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public boolean verificarCorreo() {
		return correoElectronico.indexOf("@") == correoElectronico.lastIndexOf("@");
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + "]";
	}
}
