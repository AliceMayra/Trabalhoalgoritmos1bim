package Exercicio25;

import java.util.Scanner;

public class Exercicio25 {
	
	private static Scanner s = new Scanner(System.in);
	static Integer conta= 0;
	static Integer num;
	static Integer opcao;
	
	
	static void contador (){
		System.out.println("1-> Acessar");
		System.out.println("2-> Sair");
		 opcao = s.nextInt();
		 
		 
		 switch (opcao) {
		case 1:
			num = conta +1;
			conta = num;
			
			
			
			contador();
			
			break;
			
			
		case 2:
			
			System.out.println("Numero de acessos.." + conta );
			System.exit(0);
			
			break;
			

		default:
			System.out.println("Opcao invalida, tente novamente \n\n\n\n\n");
			contador();
			break;
		}
		
		
	}
	public static void main(String[] args) {
		
		
		
		
		contador (); 
			

	}

}
