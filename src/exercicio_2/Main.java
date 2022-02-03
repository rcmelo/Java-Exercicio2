package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro, 
		// depois dizer se este número é negativo ou não.
		
		int x;
		
		System.out.println("Digite um numero POSITIVO ou NEGATIVO");
	    Scanner sc = new Scanner(System.in);
	    
	    x = sc.nextInt();	
	    
		// x = new Scanner(System.in).nextInt();
		
		
		if(x > 0 ) {
			System.out.printf("Valor POSITIVO", x);
		} else if (x < 0) {
			System.out.printf("Valor NEGATIVO", x);
		} else {
			System.out.println("Valor NULO");
		}
	}

}
