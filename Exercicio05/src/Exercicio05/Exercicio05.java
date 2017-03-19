package Exercicio05;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota;

		System.out.printf("Digite sua nota: \n (Exemplo  7,0)");
		nota = ler.nextDouble();

		if (nota >= 7.0)
			System.out.printf(" (aluno aprovado).\n");
		
		
		else if ((nota >= 4.0) && (nota < 7.0))
			System.out.printf(" (Em exame).\n");
		
		
		else
			System.out.printf(" (aluno reprovado).\n");
	}
}
