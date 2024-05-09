package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com o tamanho do lado quadrado:");
        
        double lado = scan.nextDouble();
        
        //area = lado * lado
        
        double area = Math.pow(lado, 2);
        
        System.out.println("A area do quadrado é:" + area);
        System.out.println("O dobro da area do quadrado é:" + (area * 2));
        
        
        
        
        
        
        
        
		
		
	}
	

}
