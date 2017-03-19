package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	private static Scanner in = new Scanner(System.in);

	static double base, altura;

	public static void main(String[] args) {
		
		System.out.println("1- Area do Triangulo");
		System.out.println("2- Area do Quadrado");
		System.out.println("3- Area do Retangulo");
		System.out.println("4- Area do Circulo");
		System.out.println("5- Area do Trapezio");

		Integer opcao= in.nextInt();

		switch (opcao) {
		
		case 1:
			System.out.println("altura");
			altura = in.nextDouble();

			System.out.println("base");
			base = in.nextDouble(); 

			System.out.println("O Resultado e: " + (base * altura) / 2);

			break;

		case 2:
			System.out.println("altura");
			altura = in.nextDouble();

			System.out.println("base");
			base = in.nextDouble(); 

			System.out.println("O Resultado e: " + (base * altura));

			break;

		case 3:
			System.out.println("altura");
			altura = in.nextDouble();

			System.out.println("base");
			base = in.nextDouble(); 

			System.out.println("O Resultado e: " + (base * altura));
			break;

		case 4:
			System.out.println("Digite o Raio");
			altura = in.nextDouble();
			double area= Math.PI * altura * altura;

			System.out.printf("O Resultado e %.4f: " , area);
			break;

		case 5:
			System.out.println("Digite base Maior");
			altura = in.nextDouble();

			System.out.println("Digite base Menor");
			base = in.nextDouble(); 

			System.out.println("Digite altura");
			double tamanho = in.nextDouble(); 

			System.out.println("O Resultado e: " + ((altura + base)/2) * tamanho );

			break;

		default:
			System.out.println("Comando Invalido! \n\n\n Tente novamente!");
			break;
		}
	}
}