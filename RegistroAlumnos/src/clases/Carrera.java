package clases;

public class Carrera {
	private int codigoCarrera;
	private String nombreCarrera;
	private int cantidadClases;
	public Carrera(int codigoCarrera, String nombreCarrera, int cantidadClases) {
		super();
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.cantidadClases = cantidadClases;
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

	public int getCantidadClases() {
		return cantidadClases;
	}

	public void setCantidadClases(int cantidadClases) {
		this.cantidadClases = cantidadClases;
	}

	@Override
	public String toString() {
		return nombreCarrera + "(" + codigoCarrera  + ")";
	}
	
}
