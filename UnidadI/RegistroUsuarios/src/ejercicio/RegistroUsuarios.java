package ejercicio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RegistroUsuarios {
	static int cantidadPersonas;
	static String[] personas;
	static Scanner entrada = new Scanner(System.in);
	static int opcion;
	
	static void solicitarInformacionConsola() {
		//Solicitar información
		for(int i=0;i<personas.length; i++) {
			System.out.println("Ingrese el nombre de la persona " + (i+1));
			personas[i] = entrada.nextLine();
		}
	}
	
	static void mostrarInformacionConsola() {
		//Imprimir Información
		System.out.println("______Personas registradas______");
		for(int i=0;i<personas.length; i++) {
			System.out.println((i+1) + " " + personas[i]);
		}
	}
	
	static void solicitarInformacionDialogo(){
		for(int i=0;i<personas.length; i++) 
			personas[i] = JOptionPane.showInputDialog("Ingrese el nombre de la persona " + (i+1));
	}
	
	static void mostrarInformacionDialogo(){
		String cadenaPersonas="";
		for(int i=0;i<personas.length; i++) 
			cadenaPersonas+=personas[i]+"\n";
		
		JOptionPane.showMessageDialog(null, cadenaPersonas);
	}
	
	public static void main(String[] args) {
		do {
			System.out.println("¿Cuantas personas quiere registrar?");
			cantidadPersonas = entrada.nextInt();
		} while (cantidadPersonas>10);
		entrada.nextLine(); //Solucionar bug de nextline
		personas = new String[cantidadPersonas];
		
		System.out.println("¿Que método quiere usar para capturar informacion?\n"
				+ "1. Scanner\n"
				+ "2. JOptionPane");
		opcion = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Opcion seleccionada: " + opcion);
		switch(opcion) {
		case 1:
			System.out.println("Se utilizará Scanner");
			solicitarInformacionConsola();
			mostrarInformacionConsola();
			break;
		case 2:
			System.out.println("Se utilizará JOptionPane");
			solicitarInformacionDialogo();
			mostrarInformacionDialogo();
			break;
		}
		
	}

}
