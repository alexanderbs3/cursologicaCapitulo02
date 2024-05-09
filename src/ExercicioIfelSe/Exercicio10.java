package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);
        
        System.out.println("informe o turno que voce estuda:");
        String turno = scan.next();
        
        switch(turno) {
        case"m":
        case"M": System.out.println("bom dia!"); break;
        case"v":
        case"V": System.out.println("boa tarde!"); break;
        case"b":
        case"B": System.out.println("boa noite!"); break;
        default: System.out.println("valor invalido");
        }

}
}