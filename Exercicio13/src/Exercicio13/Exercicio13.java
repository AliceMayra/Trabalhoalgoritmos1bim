package Exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	private static Scanner in = new Scanner(System.in);
	String menu;

	static String venda;
	static String Cliente;
	static String Vendedor;
	static String compra;
	static String produto;

	public static void main(String[] args) {

		System.out.println("1- Venda");
		System.out.println("2- Vendedor");
		System.out.println("3- Compra");
		System.out.println("4- Produto");
		System.out.println("5- Cliente");

		String menu = in.nextLine();

		switch (menu) {

		case "1":
			System.out.println("Digite uma venda");
			venda = in.nextLine();

			break;


		case "2" :
			System.out.println("Vendedor:");
			Vendedor = in.nextLine();

			break;

		case "3" :
			System.out.println("Compra:");
			compra = in.nextLine();

			break;


		case "4" :
			System.out.println("Produto:");
			produto = in.nextLine();

			break;

		case "5" :
			System.out.println("Cliente:");
			Cliente = in.nextLine();

			break;

		default:
			System.out.println("Comando invalido! \n\n\ Tente novamente!");
			break;
		}



	}

}


