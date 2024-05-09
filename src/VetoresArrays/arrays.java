package VetoresArrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.3;
		
		double[] temperaturas = new double [365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[5] = 34;
		temperaturas[4] = 33.3;
		
		System.out.println("O valor da temperatura do dia 1 é:"+ temperaturas[4]);
		System.out.println("o tamanho do array: " + temperaturas.length	);
		
		for (int i = 0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia "+(i+1)+"é"+temperaturas[2]);
		}
		 for (double temp : temperaturas) { 
	        System.out.println(temp);     	
	      }
	 }
}
