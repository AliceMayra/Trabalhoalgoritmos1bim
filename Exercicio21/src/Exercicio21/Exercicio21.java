package Exercicio21;

public class Exercicio21 {

	public  static void main (String [] args){
		Integer count =1;
		Integer [] [] [] [] vetor = new Integer [10] [10] [10][10];

		for (int i = 0; i < 10; i++){

			for (int j =0; j < 10; j ++){

				for (int a =0; a < 10; a ++){
					for (int b =0; b < 10; b ++){

						vetor [i] [j] [a] [b] = count; 
						count ++;
						System.out.println(vetor[i][j] [a] [b]);

					}

				}

			}

		}

	}

}


