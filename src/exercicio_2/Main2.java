package exercicio_2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro 
		// Dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite um número Inteiro: ");
		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
		
	}

}
