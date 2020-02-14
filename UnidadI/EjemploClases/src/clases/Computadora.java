package clases;

public class Computadora {//UpperCamelCase
	private float procesador;
	private float ram;
	private long almacenamientoBytes;
	private String resolucion;
	private String color;
	private String sistemaOperativo;
	private String marca;
	private String modelo;
		
	public Computadora(
			float procesador, 
			float ram, 
			long almacenamientoBytes, 
			String resolucion, 
			String color,
			String sistemaOperativo, 
			String marca, 
			String modelo
	) {
		this.procesador = procesador;
		this.ram = ram;
		this.almacenamientoBytes = almacenamientoBytes;
		this.resolucion = resolucion;
		this.color = color;
		this.sistemaOperativo = sistemaOperativo;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Computadora() {}
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int sumar(int a, int b, int c) {
		return a+b+c;
	}
	
	public int sumar(float a, float b) {
		return (int) (a+b);
	}
	
	
	public float getProcesador() {
		return procesador;
	}

	public void setProcesador(float procesador) {
		this.procesador = procesador;
	}

	public float getRam() {
		return ram;
	}

	public void setRam(float ram) {
		this.ram = ram;
	}

	public long getAlmacenamientoBytes() {
		return almacenamientoBytes;
	}

	public void setAlmacenamientoBytes(long almacenamientoBytes) {
		this.almacenamientoBytes = almacenamientoBytes;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	void almacenar() {//lowerCamelCase
		System.out.println("Almacenando");
	}
	
	void navegar() {
		System.out.println("Navegando");
	}
	
	void encender() {
		System.out.println("Encendiendo");
	}
	
	void apagar() {
		System.out.println("Apagando");
	}
	
	void procesar() {
		System.out.println("Procesando");
	}
	
	void renderizar() {
		System.out.println("Renderizando");
	}
	
	void explotar() {
		System.out.println("La computadora "+ marca +" Explotando!!!!");
	}

	public String toString() {
		return "Computadora [procesador=" + procesador + ", ram=" + ram + ", almacenamientoBytes=" + almacenamientoBytes
				+ ", resolucion=" + resolucion + ", color=" + color + ", sistemaOperativo=" + sistemaOperativo
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
