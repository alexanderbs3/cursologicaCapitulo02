package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe se o numero é positivo");
		int num = scan.nextInt();
		
		if (num >=0) {
		    System.out.println("O numero informado é positivo");
		
	        }else{
	        
	        System.out.println("O numero informado é negativo");
        }
    }
}