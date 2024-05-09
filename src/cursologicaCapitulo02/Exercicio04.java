package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("informe a segunda nota:");
		double nota2 = scan.nextDouble();
		
		System.out.println("informe a terceira nota:");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A media é:"+media);
		
		
		
	}

}
