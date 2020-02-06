package ejemplos;

import javax.swing.JOptionPane;

public class EjemploCuadrosDialogo {

	public static void main(String[] args) {
		String nombre;
		int edad;
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		JOptionPane.showMessageDialog(null, "Hola " + nombre + ", Edad: " + edad);
	}

}
