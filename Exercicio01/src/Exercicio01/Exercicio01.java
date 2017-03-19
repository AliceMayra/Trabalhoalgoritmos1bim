package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		
		System.out.print("Digite o primiro Valor");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo Valor");
		num2 = input.nextInt();
		
		soma = num1 + num2;
		
	System.out.println("valor 1:" + num1 );
	System.out.println("valor 2:" + num2 );
	System.out.println("O resultado da soma é " + soma );
	}	
}