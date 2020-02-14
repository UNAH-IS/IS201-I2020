package implementacion;

import clases.Computadora;
//POJO => Plain Old Java Object
public class Principal {

	public static void main(String[] args) {
		Computadora computadoras[] = new Computadora[4];
		
		Computadora c4 = new Computadora(3.4f, 23423f, 6666666, "1024x1090","Rojo","Linux","Lenovo","R45");
//		System.out.println("Marca: " + c4.getMarca());
//		System.out.println(c4.sumar(6, 5));
//		System.out.println(c4.sumar(6, 5, 5));

		Computadora c1 = new Computadora();
		c1.setColor("Rojo");
		c1.setMarca("DELL");
		c1.setModelo("ND344");
		c1.setSistemaOperativo("Linux");
		
		System.out.println(c1);
		
		Computadora c2 = new Computadora();
		c2.setColor("Verde");
		c2.setMarca("Asus");
		c2.setModelo("ROG");
		c2.setSistemaOperativo("Windows");
		
		Computadora c3 = new Computadora();
		c3.setColor("Anaranjada");
		c3.setMarca("Mac");
		c3.setModelo("Nose");
		c3.setSistemaOperativo("X");
		
		
		computadoras[0] = c1;
		computadoras[1] = c2;
		computadoras[2] = c3;
		computadoras[3] = c4;
		
//		System.out.println(c1.marca + "(" + c1.modelo + ")");
//		System.out.println(c2.marca + "(" + c2.modelo + ")");
//		System.out.println(c3.marca + "(" + c3.modelo + ")");
		
//		for(int i = 0;i<computadoras.length;i++)
//			System.out.println(computadoras[i]);
//		 System.out.println(computadoras[i].getMarca() + computadoras[i].getColor());
	}

}
