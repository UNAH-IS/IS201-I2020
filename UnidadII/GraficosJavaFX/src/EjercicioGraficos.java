import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EjercicioGraficos extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		Group root = new Group();
		Canvas lienzo = new Canvas(600,500);
		GraphicsContext graficos = lienzo.getGraphicsContext2D(); //Obtener los graficos para pintar
		graficos.setFill(Color.RED);
		graficos.fillRect(10,20,100,200); //x,y,ancho,alto
		graficos.setFill(Color.GREEN);
		graficos.fillOval(60, 70, 200, 200);
		graficos.setFill(Color.rgb(255,91,7));
		graficos.fillRect(300, 300, 50, 400);
		graficos.setStroke(Color.BLUE);//Color de linea
		graficos.strokeOval(100, 100, 200, 200);
		graficos.drawImage(new Image("mario.png"), 0, 0);
		root.getChildren().add(lienzo);
		Scene escena = new Scene(root, 600, 500); //Componente raiz, ancho, alto
		ventana.setScene(escena);
		ventana.setTitle("Graficos");
		ventana.setOpacity(.95);//Transparencia
		ventana.show();
	}
}



/*
 * 
 * RED GREEN BLUE
 * 0-255, 0-255, 0-255
 * 
 * 255,0,0 ROJO
 * 0,255,0 VERDE
 * 0,0,255 AZUL
 * 
 * 0,0,0 NEGRO
 * 255,255,255 BLANCO
 * 
 * 255,34,5
 * rgb(255, 91, 7)
 * 
 * 
 * */
 