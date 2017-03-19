package Exercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio16{


	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String[] vetor = new String [10];
		String nome; 

		for(int i = 0; i < 10; i++){
			System.out.println("Digite um " + "nome: ");
			nome= ler.next ();
			vetor [i]= nome; 
		}
		System.out.println(Arrays.toString(vetor));


	}
}

