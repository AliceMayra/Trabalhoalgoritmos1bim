package Exercicio14;

import java.util.Scanner;

public class Exercicio14 {
	
	static double resultado; 
	
    public static void main(String[] args) {
    	
    Scanner leitor=new Scanner(System.in);
    
    System.out.println ("Digite o Primeiro n�mero: ");
    double num1=leitor.nextDouble();
    
    System.out.println ("Digite o Segundo n�mero: ");
    double num2=leitor.nextDouble();
    
    System.out.print("Escolha uma das op��es: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n 05: Fatoracao \n 06: Potenciacao \n Op��o escolhida: ");
    int num3= leitor.nextInt();
    
 if(num3<7 && num3>0)
    	
    {
    switch (num3)
    {
        case 1:
            resultado = num1+num2;
            break;
            
        case 2:
            resultado = num1-num2;
            break;
            
        case 3:
            resultado = num1*num2;
            break;
            
        case 4:
            resultado = num1/num2;
            break;
            
        case 5:
        	
        	for (int i = 2; i <= num1; i++ ){
        		resultado *= i;
        	}
        			
            resultado = num1/num2;
            break;
            
        case 6:
        	
        	resultado = (int) Math.pow (num1, num2);
        	
            break;
            
            
            
            
    }
    System.out.println("Resultado igual a: "+ resultado);
    
}else
    {
        System.out.println("Reinicie o programa e insira um n�mero entre 1 a 6.");
    }
    }
}

