package clases;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(String fecha) { //DD-MM-YYYY
		//12-12-2012
		String partes[] = fecha.split("-");
		this.dia = Integer.parseInt(partes[0]);
		this.mes = Integer.parseInt(partes[1]);
		this.anio = Integer.parseInt(partes[2]);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
	
	public boolean verificarFecha() {
		if (dia<=0 || dia>31)
			return false;
		
		if (mes<=0 || mes>12)
			return false;
		
		if (anio<1000 || anio>3500)
			return false;
		
		return true;
		
	}
	
}
