package clases;

public class Alumno extends Persona{
	private String cuenta;	
	private double promedio;
	
	public Alumno(
			String identidad, 
			String nombre, 
			String apellido, 
			int edad, 
			String fechaNacimiento, 
			Carrera carrera,
			String[] clases, 
			String centroRegional, 
			String genero, 
			String cuenta, 
			double promedio
	) {
		super(identidad, nombre, apellido, edad, fechaNacimiento, carrera, clases, centroRegional, genero);//Llama al constructor de la clase padre
		this.cuenta = cuenta;
		this.promedio = promedio;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	public void mostrarNombre() {
		System.out.println(nombre + " " + apellido);
	}
	public void cancelarClase() {}
	public void cambiarCarrera() {}
}
