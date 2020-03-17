import java.util.ArrayList;

import clases.Abogado;
import clases.Ingeniero;
import clases.Pokemon;
import interfaces.SerVivo;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<SerVivo> seresVivos = new ArrayList<SerVivo>();
		SerVivo sv = new Ingeniero();
		SerVivo sv2 = new Abogado();
		sv.crecer();
		sv2.nacer();
		
		
		seresVivos.add(sv);
		seresVivos.add(sv2);
		seresVivos.add(new Pokemon());
		
		
	}

}
