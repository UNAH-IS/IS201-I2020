package clases;

public class Usuario {
	private String identidad; 
	private String nombre;
	private String usuario;
	private int edad;
	private String genero;
	
	public Usuario(String identidad, String nombre, String usuario, int edad, String genero) {
		this.identidad = identidad;
		this.nombre = nombre;
		this.usuario = usuario;
		this.edad = edad;
		this.genero = genero;
	}
	
	public Usuario() {}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		return "Usuario [identidad=" + identidad + ", nombre=" + nombre + ", usuario=" + usuario + ", edad=" + edad
				+ ", genero=" + genero + "]";
	}
}
