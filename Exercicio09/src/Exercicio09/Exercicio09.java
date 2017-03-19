package Exercicio09;
import java.util.Scanner;


public class Exercicio09 {
	public static void main(String[] args) {
		
		int lado1, lado2, lado3;
		int opcao = 1;
		while (opcao == 1) {
			
			Scanner ler = new Scanner(System.in);

			System.out.println("Lado 1:");
			lado1 = ler.nextInt();
			System.out.println();

			System.out.println("Lado 2:");
			lado2 = ler.nextInt();
			System.out.println();

			System.out.println("Lado 3:");
			lado3 = ler.nextInt();
			System.out.println();

			if (lado1== lado2 && lado2 == lado3 && lado3== lado1 ) {
				System.out.println("Triangulo Equilatero");
				

			}else  if (lado1 == lado2 || lado1 == lado3 || lado2== lado3 || 
					lado2== lado1 || lado3==lado1 || lado3==lado2){
				System.out.println("Triangulo Isosceles");
				

			}else {
				System.out.println("Triangulo Escaleno");
			}

			System.out.println();
			System.out.println("Deseja continuar? 1 = sim, 2 = não");
			opcao = ler.nextInt();
			System.out.println();
		}

	}

}

