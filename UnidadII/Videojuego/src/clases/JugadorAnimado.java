package clases;

import java.util.ArrayList;
import java.util.HashMap;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class JugadorAnimado extends ObjetoJuego{
	private int vidas;
	private HashMap<String, Animacion> animaciones;
	private int xImagen;
	private int yImagen;
	private int anchoImagen;
	private int altoImagen;
	private String animacionActual;
	private int direccion=1;
	
	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public JugadorAnimado(int x, int y, String nombreImagen, int velocidad, int vidas, String animacionActual) {
		super(x, y, nombreImagen, velocidad);
		this.vidas = vidas;
		this.animacionActual = animacionActual;
		animaciones = new HashMap<String, Animacion>();
		inicializarAnimaciones();
	}
	
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public void inicializarAnimaciones() {
		Rectangle coordenadasCorrer[]= {
				new Rectangle(13, 229, 75,68),
				new Rectangle(100,229, 75,68),
				new Rectangle(171,229, 75,68),
				new Rectangle(230,229, 75,68),
				new Rectangle(287,224, 75,73),
				new Rectangle(423,229, 75,68),
				new Rectangle(500,229, 75,68),
				new Rectangle(576,229, 75,68),
				new Rectangle(640,229, 75,68),
				new Rectangle(699,229, 75,68),
				new Rectangle(764,229, 75,68),
				new Rectangle(836,229, 75,73),
				new Rectangle(907,229, 75,68)	
		};
		
		Animacion animacionCorrer = new Animacion(0.05,coordenadasCorrer);
		animaciones.put("correr", animacionCorrer);
		
		Rectangle coordenadasDescanso[] = {
				new Rectangle(26, 16, 63,73),
				new Rectangle(89,16, 63,73),
				new Rectangle(154,16, 63,73),
				new Rectangle(226,16, 63,73)
		};
		Animacion animacionDescanso = new Animacion(0.1, coordenadasDescanso);
		animaciones.put("descanso",animacionDescanso);
	}
	
	public void calcularFrame(double t) {
		Rectangle coordenadas = animaciones.get(animacionActual).calcularFrameActual(t);
		this.xImagen = (int)coordenadas.getX();
		this.yImagen = (int)coordenadas.getY();
		this.altoImagen = (int)coordenadas.getWidth();
		this.anchoImagen = (int)coordenadas.getHeight();		
	}
	public Rectangle obtenerRectangulo() {
		return new Rectangle(x, y, (direccion*anchoImagen) - 10, altoImagen);
	}
	//Se ejecuta por cada iteracion del ciclo de juego
	@Override
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(nombreImagen),xImagen,yImagen,anchoImagen,altoImagen, x + (direccion==-1?anchoImagen:0), y, direccion*anchoImagen, altoImagen);//xImage, yImagen, anchoFragmento, altoFragmento, xPintar, yPintar, anchoPintar, altoPintar
		//graficos.setStroke(Color.RED);
		//graficos.strokeRect(x, y, anchoImagen - 10, altoImagen);
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
		
//		if (Juego.arriba)
//			y-=velocidad;
//		
//		if (Juego.abajo)
//			y+=velocidad;
	}

	public String getAnimacionActual() {
		return animacionActual;
	}

	public void setAnimacionActual(String animacionActual) {
		this.animacionActual = animacionActual;
	}
	
	public void verificarColisionesItem(Item item) {
		if (!item.isCapturado() && this.obtenerRectangulo().getBoundsInLocal().intersects(item.obtenerRectangulo().getBoundsInLocal())) {
			this.vidas += item.getCantidadVidas();
			item.setCapturado(true);
		}
			//System.out.println("Estan colisionando");
	}
}
