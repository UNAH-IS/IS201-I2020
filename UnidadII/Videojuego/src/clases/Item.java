package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Item extends ObjetoJuego{
	private int cantidadVidas;
	private boolean capturado=false;

	public Item(int x, int y, String nombreImagen, int velocidad, int cantidadVidas) {
		super(x, y, nombreImagen, velocidad);
		this.setCantidadVidas(cantidadVidas);
		this.ancho = (int)Juego.imagenes.get("item").getWidth();
		this.alto = (int)Juego.imagenes.get("item").getHeight();
	}

	@Override
	public void pintar(GraphicsContext graficos) {
		if (this.capturado)
			return;
		else {
			graficos.drawImage(Juego.imagenes.get("item"), this.x, this.y);
//			graficos.setStroke(Color.RED);
//			graficos.strokeRect(x, y, ancho, alto);
		}
	}

	@Override
	public void mover() {
		
	}
	
	public Rectangle obtenerRectangulo() {
		return new Rectangle(x, y, ancho, alto);
	}

	public int getCantidadVidas() {
		return cantidadVidas;
	}

	public void setCantidadVidas(int cantidadVidas) {
		this.cantidadVidas = cantidadVidas;
	}

	public boolean isCapturado() {
		return capturado;
	}

	public void setCapturado(boolean capturado) {
		this.capturado = capturado;
	}
	
	
}
