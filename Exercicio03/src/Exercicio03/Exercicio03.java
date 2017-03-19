package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int num1;
		int exponente;

		System.out.print("Digite o Valor: ");
		num1 = input.nextInt();

		exponente = num1 * num1;

		System.out.println("valor 1:" + num1 );
		System.out.println("O resultado do exponente  é " + exponente );
	}
}
