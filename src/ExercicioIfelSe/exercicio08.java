package ExercicioIfelSe;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("entre com segundo numero:");
		int num2 = scan.nextInt();

		System.out.println("entre com terceiro numero:");
		int num3 = scan.nextInt();
		
		if (num1 <= num2 && num1 >= num3){
		System.out.println("num 1 é menor"+num1);
		
		}else if (num2 <= num1 && num2 <=num3) {
			System.out.println("num2 é menor"+num2);
			
	}else if (num3 <= num1 && num3 <=num2) {
		System.out.println("num3 é menor"+num3);

  }
}
}