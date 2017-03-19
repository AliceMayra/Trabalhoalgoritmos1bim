package Exercicio15;


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {
	private static Scanner s = new Scanner(System.in);
	static String [] nome = new String [10];
	static String [] telefone = new String [10];
	static String [] email = new String [10]; 
	static Integer opcao;
	static Integer i = 0;


	static void menu(){

		System.out.println( "1-> Cadastrar");
		System.out.println("2-> Exibir Cadastro");
		opcao = s.nextInt();


		switch (opcao) {
		case 1:

			cadastrar();

			break;

		case 2:

			exibir();

			break;



		default:
			System.out.println("Opção Invalida!! \n  Tente novamente! \n\n\n");
			menu();
			break;
		}

	}


	static void cadastrar(){
		if (i  < 10){
			System.out.println("Digite o nome do cliente : ");
			nome[i]=s.next();

		}else {
			System.out.println("Cadastro Cheio!");
			System.exit(0);
		}

		System.out.println("Digite o Email: ");
		email [i] = s.next();

		System.out.println("Digite o Telefone: ");
		telefone [i] = s.next();

		i++;
		menu();


	}

	static void exibir(){

		System.out.println(Arrays.toString(nome)+"\n"
				+Arrays.toString (email)+"\n"
				+Arrays.toString(telefone));

	}


	public static void main(String[] args){

		menu();


	}

}
