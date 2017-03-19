package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		String Login;
		String Senha;


		System.out.println("Login: ");
		Login = leitor.nextLine();

		System.out.println("Senha: ");
		Senha = leitor.nextLine();

		if (Login.equals("Admin") &&  Senha.equals("Admin"))

		{
			System.out.println("Login Efetuado com Sucesso");

		} else 
			System.out.println("Usuario e/ou senha incorretos");
		{

		}




	}

}

