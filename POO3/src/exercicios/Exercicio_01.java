package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num = input.nextInt();
		System.out.printf("O valor digitado foi %d", num);
		
		input.close();
	}
}
