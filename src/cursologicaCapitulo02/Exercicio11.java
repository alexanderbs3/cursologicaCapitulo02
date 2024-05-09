package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner (System.in);
      
      System.out.println("informe um numero inteiro:");
      int num1 = scan.nextInt();
      
      System.out.println("informe o segundo numero inteiro:");
      int num2 = scan.nextInt();
      
      System.out.println("informe o terceiro numero real:");
      double num3 = scan.nextDouble();
      
      int resultado1 = (num1 * 2) * (num2 / 2);
      double resultado2 = (num1 * 3) + num3;
      double resultado3 = Math.pow(num3, 3);
      
      System.out.println("resultado1"+ resultado1);
      System.out.println("resultado2"+ resultado2);
      System.out.println("resultado3"+ resultado3);
      
      
	}

}
