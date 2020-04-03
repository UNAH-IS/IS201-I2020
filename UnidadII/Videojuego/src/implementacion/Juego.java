package implementacion;

import java.util.ArrayList;
import java.util.HashMap;

import clases.Fondo;
import clases.Item;
import clases.JugadorAnimado;
import clases.Tile;
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
	//private Jugador jugador;
	private JugadorAnimado jugadorAnimado;
	private Fondo fondo;
	public static boolean arriba;
	public static boolean abajo;
	public static boolean izquierda;
	public static boolean derecha;
	public static HashMap<String, Image> imagenes;
	
	private Item item;
	private Item item1;
	private Item item2;
		
	//private Tile tile;
	private ArrayList<Tile> tiles;

	private int tilemap[][] = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{5,5,5,5,5,5,5,5,5,5},
			{20,20,20,20,20,20,20,20,20,20},
			{20,20,20,20,20,20,20,20,20,20},
			{20,20,20,20,20,20,20,20,20,20},
			{20,20,20,20,20,20,20,20,20,20},
			{20,20,20,20,20,20,20,20,20,20},
			{20,20,20,20,20,20,20,20,20,20}
	};
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
				//System.out.println(t);
				actualizarEstado(t);
				pintar();
			}
			
		};
		
		animationTimer.start();//Empieza el ciclo de juego
	}
	
	public void actualizarEstado(double t) {
		//jugador.mover();
		jugadorAnimado.verificarColisionesItem(item);
		jugadorAnimado.verificarColisionesItem(item1);
		jugadorAnimado.verificarColisionesItem(item2);
		jugadorAnimado.calcularFrame(t);
		jugadorAnimado.mover();
		fondo.mover();
	}
	
	public void inicializarComponentes() {
		imagenes = new HashMap<String,Image>();
		cargarImagenes();
		//jugador = new Jugador(20, 40, "goku", 3, 0);
		jugadorAnimado = new JugadorAnimado(20, 150, "megaman", 3, 0,"descanso");
		fondo = new Fondo(0,0,"background","background2",5);
		inicializarTiles();
		item = new Item(200,180, "item",0, 1);
		item1 = new Item(250,180, "item",0, 1);
		item2 = new Item(300,180, "item",0, 1);
		
		//tile = new Tile(0,0,"tilemap", 0, 420, 490, 70, 70);
		root = new Group();
		escena = new Scene(root, 700, 500);
		lienzo = new Canvas(700, 500);
		root.getChildren().add(lienzo);
		graficos = lienzo.getGraphicsContext2D();
	}
	
	public void inicializarTiles() {
		tiles = new ArrayList<Tile>();
		for(int i=0;i<tilemap.length;i++) {
			for(int j=0;j<tilemap[i].length;j++) {
				if (tilemap[i][j]!=0)
					this.tiles.add(new Tile(tilemap[i][j],j*70,i*70,"tilemap",0,70,70));
				
			}
			
		}
		
	}
	public void cargarImagenes() {
		imagenes.put("goku", new Image("goku.png"));
		imagenes.put("goku-furioso", new Image("goku-furioso.png"));
		imagenes.put("background",new Image("background.jpg"));
		imagenes.put("background2",new Image("background2.jpg"));
		imagenes.put("tilemap",new Image("tilemap.png"));
		imagenes.put("megaman", new Image("megaman.png"));
		imagenes.put("item", new Image("item.png"));
	}
	
	public void pintar() {
		//graficos.fillRect(0,0,100,100);
		fondo.pintar(graficos);
		//tile.pintar(graficos);
		for(int i=0;i<tiles.size();i++)
			tiles.get(i).pintar(graficos);
		//jugador.pintar(graficos);
		jugadorAnimado.pintar(graficos);
		item.pintar(graficos);
		item1.pintar(graficos);
		item2.pintar(graficos);
		graficos.fillText("Vidas: " + jugadorAnimado.getVidas(), 20, 20);
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
						jugadorAnimado.setDireccion(1);
						jugadorAnimado.setAnimacionActual("correr");
						break;
					case "LEFT":
						izquierda = true;
						jugadorAnimado.setDireccion(-1);
						jugadorAnimado.setAnimacionActual("correr");
						break;
					case "UP":
						arriba = true;
						break;
					case "DOWN":
						abajo = true;
						break;
					case "SPACE":
						//jugador.setVelocidad(15);
						jugadorAnimado.setVelocidad(15);
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
						jugadorAnimado.setAnimacionActual("descanso");
						break;
					case "LEFT":
						izquierda = false;
						jugadorAnimado.setAnimacionActual("descanso");
						break;
					case "UP":
						arriba = false;
						break;
					case "DOWN":
						abajo = false;
						break;
					case "SPACE":
						jugadorAnimado.setVelocidad(5);
						break;
				}
			}
			
		});
	}
	
	

}














