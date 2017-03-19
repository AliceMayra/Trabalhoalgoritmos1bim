package Exercicio20;

public class Exercicio20 {
	public static void main(String[] args){
		String[][] matriz = new String[2][2]; 

		parametroMatriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz [i][j]);
			}
		}

	}

	private static String[][] parametroMatriz(String [][] matriz ) {

		matriz[0][0] = "Anime";	
		matriz[0][1] = "Akame";
		matriz[1][0] = "ga";
		matriz[1][1] = "Kill";

		return matriz;
	}
}

