package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Informe a temperatura:");
      
      double c = scan.nextDouble();
      
      double f = (c * 1.8) + 32;
      
      System.out.println("A temperatura " + c + "C é igual a "+ f +"F");
	}

}
