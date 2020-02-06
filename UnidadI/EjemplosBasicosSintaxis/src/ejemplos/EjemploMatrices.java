package ejemplos;

public class EjemploMatrices {

	public static void main(String[] args) {
		int matriz[][] =new int[17][34];
		//Asignar valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}

		//Imprimir valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				//System.out.println("Elemento ["+i+"]["+j+"]: "+matriz[i][j]);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

}
