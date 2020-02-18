package implementacion;

import javax.swing.JOptionPane;

public class Principal {
	int opcion=0;
	public Principal() {
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Agregar \n"
					+ "2. Actualizar\n"
					+ "3. Eliminar\n"
					+ "4. Mostrar Informacion\n"
					+ "0. Salir"
			));
			
			
		}while(opcion!=0);
	}
	public static void main(String[] args) {
		new Principal();
	}

}
