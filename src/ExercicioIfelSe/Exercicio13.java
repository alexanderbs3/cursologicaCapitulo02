package ExercicioIfelSe;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int opcao;
        int num1, num2;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 – Soma");
            System.out.println("2 – Subtração");
            System.out.println("3 – Multiplicação");
            System.out.println("4 – Divisão");
            System.out.println("5 – Trocar valores");
            System.out.println("6 – Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println("Soma: " + (num1 + num2));
            } else if (opcao == 2) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println("Subtração: " + (num1 - num2));
            } else if (opcao == 3) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println("Multiplicação: " + (num1 * num2));
            } else if (opcao == 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
                if (num2!= 0) {
                    System.out.println("Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
            } else if (opcao == 5) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
                int temp = num1;
                num1 = num2;
                num2 = temp;
                System.out.println("Valores trocados: Primeiro número = " + num1 + ", Segundo número = " + num2);
            } else if (opcao == 6) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao!= 6);
        
        scan.close();
    }
}