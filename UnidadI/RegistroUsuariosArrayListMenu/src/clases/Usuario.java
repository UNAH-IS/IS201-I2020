package clases;

public class Usuario {
	private String identidad; 
	private String nombre;
	private String usuario;
	private int edad;
	private String genero;
	private Carrera carrera; //Composición
	
	public Usuario(String identidad, String nombre, String usuario, int edad, String genero, Carrera carrera) {
		this.identidad = identidad;
		this.nombre = nombre;
		this.usuario = usuario;
		this.edad = edad;
		this.genero = genero;
		this.setCarrera(carrera);
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

	

	@Override
	public String toString() {
		return "Usuario [identidad=" + identidad + ", nombre=" + nombre + ", usuario=" + usuario + ", edad=" + edad
				+ ", genero=" + genero + ", carrera=" + carrera + "]";
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
}
