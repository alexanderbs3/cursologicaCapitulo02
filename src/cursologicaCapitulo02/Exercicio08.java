package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o valor/hora:");
		double valorHora = scan.nextDouble();
	   
		System.out.println("Entre com a quantidade de horas: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario é de:"+ salario);

	}

}
