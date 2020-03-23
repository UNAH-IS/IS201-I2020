package implementacion;

import java.util.HashMap;

import clases.Jugador;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Juego extends Application{
	private GraphicsContext graficos;
	private Group root;
	private Scene escena;
	private Canvas lienzo;
	private int x = 0;
	private Jugador jugador;
	public static boolean arriba;
	public static boolean abajo;
	public static boolean izquierda;
	public static boolean derecha;
	public static HashMap<String, Image> imagenes;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		inicializarComponentes();
		gestionEventos();
		ventana.setScene(escena);
		ventana.setTitle("Super juego");
		ventana.show();
		cicloJuego();
	}
	
	public void cicloJuego() {
		long tiempoInicial = System.nanoTime();
		AnimationTimer animationTimer = new AnimationTimer() {

			//Este metodo se ejecuta aproximadamente 60 veces por segundo 60FPS
			@Override
			public void handle(long tiempoActual) {
				double t = (tiempoActual - tiempoInicial) / 1000000000.0;
				System.out.println(t);
				actualizarEstado();
				pintar();
			}
			
		};
		
		animationTimer.start();//Empieza el ciclo de juego
	}
	
	public void actualizarEstado() {
		jugador.mover();
	}
	
	public void inicializarComponentes() {
		imagenes = new HashMap<String,Image>();
		cargarImagenes();
		jugador = new Jugador(20, 40, 3, "goku");
		root = new Group();
		escena = new Scene(root, 700, 500);
		lienzo = new Canvas(700, 500);
		root.getChildren().add(lienzo);
		graficos = lienzo.getGraphicsContext2D();
	}
	
	public void cargarImagenes() {
		imagenes.put("goku", new Image("goku.png"));
	}
	
	public void pintar() {
		//graficos.fillRect(0,0,100,100);
		graficos.drawImage(new Image("background.jpg"), 0, 0);
		jugador.pintar(graficos);
	}
	
	public void gestionEventos() {
		//escena.setOnKeyPressed(new Evento());
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			//El metodo handle se ejecuta cada vez que presiono una tecla.
			@Override
			public void handle(KeyEvent evento) {
				switch(evento.getCode().toString()) {
					case "RIGHT":
						derecha = true;
						break;
					case "LEFT":
						izquierda = true;
						break;
					case "UP":
						arriba = true;
						break;
					case "DOWN":
						abajo = true;
					case "SPACE":
						jugador.setVelocidad(15);
						jugador.setNombreImagen("goku-furioso.png");
						break;
				}
			}
		});
		
		escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

			//Este metodo se ejecuta cuando se suelta una tecla
			@Override
				public void handle(KeyEvent evento) {
					switch(evento.getCode().toString()) {
					case "RIGHT":
						derecha = false;
						break;
					case "LEFT":
						izquierda = false;
						break;
					case "UP":
						arriba = false;
						break;
					case "DOWN":
						abajo = false;
					case "SPACE":
						jugador.setVelocidad(5);
						jugador.setNombreImagen("goku.png");
				}
			}
			
		});
	}
	
	

}














