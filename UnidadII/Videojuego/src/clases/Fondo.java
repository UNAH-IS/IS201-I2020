package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Fondo extends ObjetoJuego{
	private String nombreImagen2;
	private int x2;
	public Fondo(int x, int y, String nombreImagen,String nombreImagen2, int velocidad) {
		super(x, y, nombreImagen, velocidad);
		this.nombreImagen2=nombreImagen2;
		this.ancho = (int)Juego.imagenes.get("background").getWidth();
		this.alto = (int)Juego.imagenes.get("background").getHeight();
		this.x2 = this.ancho+this.x;
	}

	@Override
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(this.nombreImagen), this.x, this.y);
		graficos.drawImage(Juego.imagenes.get(this.nombreImagen2), this.x2, this.y);
	}

	@Override
	public void mover() {
		if (x <= -1*ancho) {
			x=ancho;
		}
		if (x2 <= -1*ancho) {
			x2=ancho;
		}
		if (Juego.derecha) {
			x-=velocidad;
			x2-=velocidad;
		}
		
		if (Juego.izquierda) {
			x+=velocidad;
			x2+=velocidad;
		}
	}
	
}
