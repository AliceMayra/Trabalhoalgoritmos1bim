package Exercicio10;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		double a, b, c;

		System.out.println("Lado 1");
		a= leitor.nextDouble();

		System.out.println("Lado 2");
		b= leitor.nextDouble();

		System.out.println("Lado 3");
		c= leitor.nextDouble(); 

		if( a < (b + c) && b < (a + c) && c < (a+b))
		{

			if (a==b && b==c) {
				System.out.println("Forma um: \n\n Triangulo equilatero");
				
			}
			else if (a ==b || b==c || a==c){ 
				System.out.println("Forma um: \n\n Triangulo isosceles");
				
			}

			else {
				System.out.println("Formam um: \n\n Triangulo escaleno");
			}
		}
		else {

			System.out.println("Não é um Triangulo");
		}


	}
}


