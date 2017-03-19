package Exercicio23;

import java.util.Scanner;

public class Exercicio23 {
	public  static void main (String [] args){
		Scanner s = new Scanner(System.in);		
		Integer [] [] matrizA = new Integer [2] [2];
		
		for (int i = 0; i < matrizA.length ; i++){ 
			for (int j =0; j < matrizA.length; j ++){
				System.out.println("Digite um numero: ");
				matrizA[i][j]= s.nextInt();
			}
		}
			
		
		Integer [] [] matrizB = new Integer [5] [5] ;
		for (int i = 0; i < matrizA.length ; i++){ 
			for (int j =0; j < matrizA.length; j ++){

				matrizB[i][j] = matrizA[i][j]; 
				
				System.out.println(matrizB[i][j]);



			}

		}

	}


}

