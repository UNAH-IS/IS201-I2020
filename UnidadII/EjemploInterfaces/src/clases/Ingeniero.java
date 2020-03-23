package clases;

import interfaces.Humano;

public class Ingeniero implements Humano{
	public String nombre;
	public String apellido;
	
	public void estudiar() {
		System.out.println("Estudiando");
	}
	
	public void construir() {
		System.out.println("Construyendo");
	}
	
	public void crear() {
		System.out.println("Creando");
	}

	@Override
	public void nacer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crecer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
}
