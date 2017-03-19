package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args){

		Scanner s = new Scanner(System.in);

		int num1, num2, resut;

		System.out.println("Digite um numero:");
		num1= s.nextInt();

		System.out.println("Digite o exponente:");
		num2= s.nextInt();

		resut = (int) Math.pow(num1, num2);

		System.out.println("O resultado é:" + resut);

	}
}
