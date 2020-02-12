package clases;

public class Computadora {
	float procesador;
	float ram;
	long almacenamientoBytes;
	String resolucion;
	String color;
	String sistemaOperativo;
	String marca;
	String modelo;
	
	void almacenar() {
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
}
