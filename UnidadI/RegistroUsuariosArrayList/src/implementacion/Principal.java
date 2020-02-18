package implementacion;

import java.util.ArrayList;

import clases.Usuario;

public class Principal {
	Usuario u1;
	Usuario u2;
	Usuario u3;
	ArrayList<Usuario> usuarios; //<> se lo conoce como RawType o Receptáculo
	
	public Principal() {
		usuarios = new ArrayList<Usuario>();
		
		u1 = new Usuario("324234","Juan Perez","jperez",33,"Masculino");
		u2 = new Usuario("342342","Pedro Martinez","pmartinez",33,"Masculino");
		u3 = new Usuario("6666","Maria Hernandez","mhernandez",36,"Femenino");
		usuarios.add(u1);//0
		usuarios.add(u2);//1
		usuarios.add(u3);//2
		usuarios.add(new Usuario("67777","Matusalen Martinez","mmatinez",999999,"Masculino"));
		
		usuarios.remove(1);
		usuarios.set(2, new Usuario("00009","Luisa Lorena","llorena",33,"Femenino"));
		
		usuarios.get(0).setNombre("Juan Peres");
		
		for(int i=0;i<usuarios.size();i++)
			System.out.println(usuarios.get(i));
	}

	public static void main(String[] args) {
		new Principal();
	}

}
