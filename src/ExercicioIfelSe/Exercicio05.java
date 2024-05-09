package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("entre com uma letra:");
		String letra = scan.next();
		
		switch (letra){
		case"a":      
		case"b":
		case"c":
		case"d":
		case"e":
		case"A":
		case"B":
		case"C":
		case"D":
		case"E":
			System.out.println("vogal"); break;
			default:System.out.println("cansoante");
			
		
		
		
		}
   }
}
		
	