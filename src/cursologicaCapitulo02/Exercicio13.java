package cursologicaCapitulo02;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com valor hora: ");
	    double valorHora = scan.nextDouble();
	    
	    System.out.println("horas trabalhadas no mes: ");
	    double hora = scan.nextDouble();
	    
	    
	    double salariobruto = valorHora * hora;
	    double inss = (salariobruto / 100) * 8;
	    double sindicato = (salariobruto / 100) * 5;
	    double ir = (salariobruto/ 100) * 11;
	    double totaldescontos = inss + sindicato + ir;
	    double salarioLiquido = salariobruto - totaldescontos;
	    
	    
	    System.out.println("Salario bruto " + salariobruto);
	    System.out.println("" + inss);
	    System.out.println("" + sindicato);
	    System.out.println("" + ir);
	    System.out.println("" +totaldescontos);
	    System.out.println(""+ salarioLiquido);
	    
	    

	}

}
