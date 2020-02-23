package clases;

public class Carrera {
	private int codigoCarrera;
	private String nombreCarrera;
	private int cantidadAsignaturas;

	public Carrera(int codigoCarrera, String nombreCarrera, int cantidadAsignaturas) {
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.cantidadAsignaturas = cantidadAsignaturas;
	}
	
	public Carrera() {}

	public int getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(int codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getCantidadAsignaturas() {
		return cantidadAsignaturas;
	}

	public void setCantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}

	public String toString() {
		return "Carrera [codigoCarrera=" + codigoCarrera + ", nombreCarrera=" + nombreCarrera + ", cantidadAsignaturas="
				+ cantidadAsignaturas + "]";
	}	
	
}
