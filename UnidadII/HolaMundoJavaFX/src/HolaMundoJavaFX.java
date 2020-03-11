import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HolaMundoJavaFX extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		//Inicializar todo lo referente a la ventana
		Group root = new Group();
		Scene escena = new Scene(root,500,500);
		ventana.setScene(escena);
		ventana.setTitle("Hola Mundo JavaFX");
		ventana.show();
		
	}

}
