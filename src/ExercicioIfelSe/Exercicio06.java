package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("informe a primeira nota aluno:");
		double nota1 = scan.nextDouble();

		System.out.println("informe a segunda nota aluno:");
		double nota2 = scan.nextDouble();
          
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
		System.out.println("Aprovado com distição");
	} else if (media >=7){ 
			System.out.println("Aluno aprovado");
	     }else{
	    	 System.out.println("Aluno reprovado");   	
	}
  }
}
