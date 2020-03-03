import javax.swing.JOptionPane;

public class Principal {
	int a = 4;
	public Principal() {
		Persona p = new Persona();
		p.valorEstatico = 100;
		
		Persona p1 = new Persona();
		p1.valorEstatico = 200;
		
		
		Persona.valorEstatico=500;
		
		System.out.println(Persona.valorEstatico);
		System.out.println(p.valorEstatico);
		System.out.println(p1.valorEstatico);
		
		
		Integer.parseInt("4");
		
		JOptionPane.showMessageDialog(null,"Hola, este es un metodo estatico");
		
		System.out.println(Math.pow(2, 2));
		
	
	}
	
	
	public static void main(String[] args) {
		new Principal();
	}
}
