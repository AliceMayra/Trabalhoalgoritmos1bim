package Exercicio11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		String vetor1;

		System.out.println("Digite a data:");
		String dia = s.nextLine();

		Date data =null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try{
			format.setLenient(false);

			data= format.parse(dia);
			
		} catch (ParseException e){
			System.out.println("Data invalida!");
			System.exit(0);

		}

		char vetor2 [] = dia.toCharArray();


		String mes = vetor2[3]+ ""+ vetor2[4];


		switch (mes) {
		case "01":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Janeiro de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "02":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Fevereiro de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;


		case "03":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Março de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "04":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Abril de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "05":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Maio de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "06":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Junho de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "07":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Julho de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "08":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Agosto de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		case "09":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Setembro de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;


		case "10":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Outubro de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;


		case "11":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de Novembro de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;


		case "12":

			System.out.println(vetor2 [0]+""+ vetor2[1]+" de D de "+ vetor2 [6]+""
					+ vetor2[7]+ ""+ vetor2[8]+"" + vetor2[9] );

			break;

		default:
			break;
		}


	}
}









