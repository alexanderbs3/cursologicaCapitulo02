package cursologicaCapitulo02;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("informe a altura: ");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("o peso ideal é :" + pesoIdeal);
		
	}

}
