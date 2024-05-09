package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero:");
        int num1 = scan.nextInt();
        
        
        System.out.println("entre com o segundo numero:");
        int num2 = scan.nextInt();
        
        int  resultado = num1 + num2;
         System.out.println("a soma dos numero é:" + resultado);		
		
	}

}
