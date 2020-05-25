package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import clases.Alumno;
import clases.Carrera;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class VistaController implements Initializable{
	private ObservableList<Carrera> carreras;
	private ObservableList<Alumno> alumnos;
	@FXML private ComboBox<Carrera> cboCarreras;
	@FXML private ListView<Alumno> lstAlumnos;
	@FXML private TextField txtNombre;
	@FXML private TextField txtApellido;
	@FXML private TextField txtEdad;
	@FXML private TextField txtIdentidad;
	@FXML private TextField txtCuenta;
	@FXML private TextField txtPromedio;
	@FXML private TextField txtCentroRegional;
	@FXML private DatePicker dpFechaNacimiento;
	@FXML private ToggleGroup genero;
	@FXML private RadioButton rbtMasculino;
	@FXML private RadioButton rbtFemenino;
	
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	
	private ArrayList<String> errores;
	private final String NOMBRE_ARCHIVO = "alumnos.data";
	//private ObjectInputStream flujoEntrada;

	
	public VistaController() {
		//En el constructor aún no existen los componentes del UI
		errores = new ArrayList<String>();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Metodo que se ejecuta cuando se instanciaron todos los componentes del FXML
		
		carreras = FXCollections.observableArrayList();
		alumnos = FXCollections.observableArrayList();
		
		//Lectura del archivo
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO));
			while(true) {
				alumnos.add((Alumno)flujoEntrada.readObject());
			}
		} catch (EOFException e) {
			System.out.println("Fin de archivo");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
		carreras.add(new Carrera(115, "Ing en Sistemas", 50));
		carreras.add(new Carrera(116, "Ing Quimica", 55));
		carreras.add(new Carrera(117, "Ing Mecánica", 52));
		carreras.add(new Carrera(118, "Ing Industrial", 54));
		
		cboCarreras.setItems(carreras);//Null
		lstAlumnos.setItems(alumnos);
		
		
		
		lstAlumnos.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Alumno>() {

					@Override
					public void changed(ObservableValue<? extends Alumno> arg0, 
							Alumno alumnoAnterior, 
							Alumno alumnoSeleccionado) {
						if (alumnoSeleccionado != null) {
							System.out.println("Se selecciono un elemento de la lista");
							System.out.println("Anterior: " + alumnoAnterior);
							System.out.println("Nuevo: " + alumnoSeleccionado);
							
							txtIdentidad.setText(alumnoSeleccionado.getIdentidad());
							txtNombre.setText(alumnoSeleccionado.getNombre());
							txtApellido.setText(alumnoSeleccionado.getApellido());
							txtEdad.setText(String.valueOf(alumnoSeleccionado.getEdad()));
							dpFechaNacimiento.setValue(LocalDate.parse(alumnoSeleccionado.getFechaNacimiento()));
							
							cboCarreras.getSelectionModel().select(alumnoSeleccionado.getCarrera());
							txtCentroRegional.setText(alumnoSeleccionado.getCentroRegional());
							if (alumnoSeleccionado.getGenero().equals("Masculino"))
								rbtMasculino.setSelected(true);
							else
								rbtFemenino.setSelected(true);
							txtCuenta.setText(alumnoSeleccionado.getCuenta());
							txtPromedio.setText(String.valueOf(alumnoSeleccionado.getPromedio()));
							
							btnGuardar.setDisable(true);
							btnActualizar.setDisable(false);
							btnEliminar.setDisable(false);
						}
					}
					
				}
		);
		
	}
	
	@FXML
	public void guardar() {
		System.out.println("Guardar Alumno");
		validar();
		if (errores.size()>0) {
			String cadenaErrores = "";
			for(int i=0; i<errores.size(); i++)
				cadenaErrores+=errores.get(i) + "\n";
			
			Alert mensaje = new Alert(AlertType.ERROR);
			mensaje.setTitle("Error");
			mensaje.setHeaderText("Se encontraron los siguientes errores");
			mensaje.setContentText(cadenaErrores);
			mensaje.initOwner(Main.ventana);
			mensaje.show();
			return;
		}
		
		Alumno alumno = new Alumno(
			txtIdentidad.getText(),
			txtNombre.getText(),
			txtApellido.getText(),
			Integer.parseInt(txtEdad.getText()),
			dpFechaNacimiento.getValue().toString(),
			cboCarreras.getSelectionModel().getSelectedItem(),
			null,
			txtCentroRegional.getText(),
			((RadioButton)genero.getSelectedToggle()).getText(),
			txtCuenta.getText(),
			Double.parseDouble(txtPromedio.getText())
		);
		alumnos.add(alumno);
		
		guardarEnArchivo();	
		limpiar();
	}
	
	public void guardarEnArchivo() {
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO));
			for (int i=0;i<alumnos.size();i++)
				flujoSalida.writeObject(alumnos.get(i));
			
			flujoSalida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	public void limpiar() {
		txtIdentidad.setText(null);
		txtNombre.setText(null);
		txtApellido.setText(null);
		txtEdad.setText(null);
		dpFechaNacimiento.setValue(null);
		cboCarreras.getSelectionModel().select(null);
		txtCentroRegional.setText(null);
		genero.selectToggle(null);
		txtCuenta.setText(null);
		txtPromedio.setText(null);
		
		btnGuardar.setDisable(false);
		btnActualizar.setDisable(true);
		btnEliminar.setDisable(true);
		
		lstAlumnos.getSelectionModel().clearSelection();
	}
	
	@FXML
	public void actualizar() {
		alumnos.set(
			lstAlumnos.getSelectionModel().getSelectedIndex(),
			new Alumno(
				txtIdentidad.getText(),
				txtNombre.getText(),
				txtApellido.getText(),
				Integer.parseInt(txtEdad.getText()),
				dpFechaNacimiento.getValue().toString(),
				cboCarreras.getSelectionModel().getSelectedItem(),
				null,
				txtCentroRegional.getText(),
				((RadioButton)genero.getSelectedToggle()).getText(),
				txtCuenta.getText(),
				Double.parseDouble(txtPromedio.getText())
			)
		);
		
		guardarEnArchivo();
		limpiar();
	}
	
	@FXML
	public void eliminar() {
		Alert mensaje = new Alert(AlertType.CONFIRMATION);
		mensaje.setTitle("Eliminar");
		mensaje.setHeaderText("Se eliminará un registro");
		mensaje.setContentText("¿Desea eliminar el registro?");
		mensaje.initOwner(Main.ventana);
		Optional<ButtonType> resultado = mensaje.showAndWait();
		if (resultado.get() == ButtonType.OK) {
			alumnos.remove(lstAlumnos.getSelectionModel().getSelectedIndex());
			guardarEnArchivo();
			limpiar();
		}
	}
	
	public void validar() {
		errores.clear();
		if (txtCuenta.getText().isEmpty())
			errores.add("El campo cuenta es obligatorio");
		
		if (txtIdentidad.getText().isEmpty())
			errores.add("El campo identidad es obligatorio");
		
		if (txtNombre.getText().isEmpty())
			errores.add("El campo nombre es obligatorio");
		
		if (txtApellido.getText().isEmpty())
			errores.add("El campo apellido es obligatorio");
		
		if (txtEdad.getText().isEmpty())
			errores.add("El campo edad es obligatorio");
		
		if (dpFechaNacimiento.getValue() == null)
			errores.add("El campo fecha de nacimiento es obligatorio");
		
		if (txtCentroRegional.getText().isEmpty())
			errores.add("El campo centro regional es obligatorio");
		
		if (genero.getSelectedToggle() == null)
			errores.add("Debe seleccionar un genero");
		
		if (cboCarreras.getSelectionModel().getSelectedItem() == null)
			errores.add("Debe seleccionar una carrera");
		
		if (txtPromedio.getText().isEmpty())
			errores.add("El campo promedio es obligatorio");
		
		
		if (!txtEdad.getText().isEmpty()) {
			try {
				Integer.parseInt(txtEdad.getText());
			}
			catch(NumberFormatException e) {
				//e.printStackTrace();
				errores.add("El campo edad debe ser numérico");
			}
		}
		
		if (!txtPromedio.getText().isEmpty()) {
			try {
				Double.parseDouble(txtPromedio.getText());
			}
			catch(NumberFormatException e) {
				//e.printStackTrace();
				errores.add("El campo promedio debe ser numérico");
			}
		}
		
		//1008-1987-12345
		String regexIdentidad = "[0-9]{4}-[0-9]{4}-[0-9]{5}";
		String regexEmail = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		
		if (!Pattern.matches(regexIdentidad, txtIdentidad.getText()))
			errores.add("Identidad inválida, no cumple con el patron");
	}
	
	
	
	
	
}
