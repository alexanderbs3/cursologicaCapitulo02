package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("entre com primeiro preco");
		double preco1 = scan.nextDouble();
		
		System.out.println("entre com segundo preco:");
		double preco2 = scan.nextDouble();

		System.out.println("entre com terceiro preco:");
		double preco3 = scan.nextDouble();
		
		if(preco1 <= preco2 && preco1 <= preco3){
			System.out.println("compre o produto 1");	
		}else if (preco2 <= preco1 && preco2 <= preco3){
			System.out.println("compre o produto 2");
		}else if (preco3 <= preco1 && preco2 <= preco3){
			System.out.println("compre o produto 3");
		}
		
		

	}

}
