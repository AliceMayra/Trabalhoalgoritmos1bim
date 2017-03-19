package Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		Integer[] vetor = new Integer [10];
		Integer soma = 0; 

		for(Integer i = 0; i < vetor.length; i++){
			System.out.println("Digite um " + "valor: ");
			vetor [i]= ler.nextInt ();
			soma = soma +  vetor[i];  
		}
		System.out.println("Total: "+soma);
	}
}