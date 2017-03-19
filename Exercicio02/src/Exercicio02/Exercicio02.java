package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int multiplica;
			
		System.out.print("Digite o primeiro Valor");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo Valor");
		num2 = input.nextInt();
		
		multiplica = num1 * num2;
		
	System.out.println("valor 1:" + num1 );
	System.out.println("valor 2:" + num2 );
	System.out.println("O resultado da multiplição é " + multiplica );
	}	
}
