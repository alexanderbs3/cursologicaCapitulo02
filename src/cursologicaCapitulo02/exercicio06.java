package cursologicaCapitulo02;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner (System.in);
		
	    System.out.println("Entre com o raio do circulo:");
	    double raio = scan.nextDouble ();
	    
	    double area = Math.PI * Math.pow(raio, 2);
	    
	    System.out.println("a area no circulo é:"+ area);
	   
	    
	}

}
