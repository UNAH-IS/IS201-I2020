package clases;

public class Principal {

	public static void main(String[] args) {
		String clases []  = {"Clase 1", "Clase 2", "Clase 3"};
		Alumno a = new Alumno("080123423423423", 
				"Juan",
				"Perez",
				33,
				"12-12-2012",
				new Carrera(112,"Ing Sistemas", 56),
				clases,
				"Ciudad Universitaria",
				"Masculino",
				"20100909094",
				64.5
		) ;
		
		a.mostrarNombre();
	}

}
