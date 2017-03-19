package Exercicio;

public class Exercicio18 {

	public static void main(String[] args){
		String[][] matriz = new String[2][2]; 

		parametroMatriz(matriz);
	}

	private static void parametroMatriz(String [][] matriz ) {

		matriz[0][0] = "System of a Down";	
		matriz[0][1] = "Extreme";
		matriz[1][0] = "Megadeth";
		matriz[1][1] = "Ozzy Osbourne";


		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz [i][j]);
			}
		}
	}
}