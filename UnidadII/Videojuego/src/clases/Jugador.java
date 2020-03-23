package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Jugador {
	private int x;
	private int y;
	private int vidas;
	private String nombreImagen;
	private int velocidad=5;
	public Jugador(int x, int y, int vidas, String nombreImagen) {
		this.x = x;
		this.y = y;
		this.vidas = vidas;
		this.nombreImagen = nombreImagen;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}
	
	//Se ejecuta por cada iteracion del ciclo de juego
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(nombreImagen), x, y);
	}
	
	//Se ejecuta por cada iteracion del ciclo de juego
	public void mover() {
		if (x>700)
			x=-80;
		
		if (Juego.derecha)//Mover hacia la derecha
			x+=velocidad;
		
		if (Juego.izquierda)//Mover hacia la derecha
			x-=velocidad;
		
		if (Juego.arriba)
			y-=velocidad;
		
		if (Juego.abajo)
			y+=velocidad;
	}
}
