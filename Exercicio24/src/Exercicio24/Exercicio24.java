package Exercicio24;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Integer i = 0;
		String[] vetor= new String [3];

		Scanner s=new Scanner(System.in);

		for(i = 0 ; i < vetor.length ; i++){
			System.out.println("Digite as frase: ");
			vetor[i] = s.nextLine();

		}
		System.out.println("As frases armazenadas foram: "+Arrays.toString(vetor));

		System.out.println("Digite a nova frase: ");
		String frase=s.nextLine();


		System.out.println("Digite a posição a ser alterada de \n\n"
				+ "1 - para alterar '"+vetor[0]+"'\n"
				+ "2 - para altertar'"+vetor[1]+"'\n"
				+ "3 - para alterar'"+vetor[2]+"'");


		Integer posicao = s.nextInt();
		posicao = posicao - 1;

		System.out.println("A frase "+vetor[posicao]+" será alterada por: "+frase);

		for(int clear = 0; clear < 1000; clear++){
			System.out.println("\n") ;
		}

		vetor [posicao] = frase;
		System.out.println("As novas frases são:"+Arrays.toString(vetor));

	}
}