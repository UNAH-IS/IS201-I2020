package clases;

public class Principal {

	public static void main(String[] args) {
		Computadora computadoras[] = new Computadora[5];
		

		Computadora c = new Computadora();
		c.color = "Rojo";
		c.marca = "DELL";
		c.modelo = "ND344";
		c.sistemaOperativo = "Linux";
		
		Computadora c2 = new Computadora();
		c2.color = "Verde";
		c2.marca = "Asus";
		c2.modelo = "ROG";
		c2.sistemaOperativo = "Windows";
		
		Computadora c3 = new Computadora();
		c3.color = "Anaranjada";
		c3.marca = "Mac";
		c3.modelo = "Nose";
		c3.sistemaOperativo = "X";
		
		System.out.println(c.marca + "(" + c.modelo + ")");
		System.out.println(c2.marca + "(" + c2.modelo + ")");
		System.out.println(c3.marca + "(" + c3.modelo + ")");
		
		c.explotar();
	}

}
