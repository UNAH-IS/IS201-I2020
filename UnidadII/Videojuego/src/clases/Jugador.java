package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Jugador extends ObjetoJuego{
	private int vidas;
	
	public Jugador(int x, int y, String nombreImagen, int velocidad, int vidas) {
		super(x, y, nombreImagen, velocidad);
		this.vidas = vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	//Se ejecuta por cada iteracion del ciclo de juego
	@Override
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(nombreImagen), x, y);
	}
	
	//Se ejecuta por cada iteracion del ciclo de juego
	@Override
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
