package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("entre com a quantidade metros:");
		double  metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + "metros é igual:" + cm +" cm ");
		
		 
	}

}
