package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe a temperatura:");
        
        double f = scan.nextDouble();
        
        double c = (5 * (f - 32) / 9);
        
        System.out.println("A temperatura " + f + "f é igual a "+ c +"C");
	}

}
