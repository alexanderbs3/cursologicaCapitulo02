package LoopWhileDoWhile;

import java.util.Scanner;

public class loopFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		for(int i=0; i < 5; i++) {
			System.out.println("i tem valor: "+ i);
		}
     
		for (int i = 5;i>0;i--) {
			System.out.println("i tem valor: " + i);
	}
 
		for (int i=0, j=10 ; i < j ; i++, j--) {
			System.out.println("i="+ i +"; j =" + j);
		}
}
}