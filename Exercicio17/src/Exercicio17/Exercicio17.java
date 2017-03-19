package Exercicio17;

public class Exercicio17 {
	public static void  main (String [] args){
		String[] vetor = new String[2]; 

		parametroVetor(vetor);

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);

	}

	private static void parametroVetor(String [] vetor ) {

		vetor[0] = "Soad";	
		vetor[1] = "Chop Suey";

	}
}
