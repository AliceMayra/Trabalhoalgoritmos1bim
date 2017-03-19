package Exercicio19;

public class Exercicio19 {
	public static void  main (String [] args){
		String[] vetor = new String[2]; 

		parametroVetor(vetor);

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);

	}

	private static String[] parametroVetor(String [] vetor ) {

		vetor[0] = "Hello World";	
		vetor[1] = "Olá Mundo";
		return vetor;



	}
}


