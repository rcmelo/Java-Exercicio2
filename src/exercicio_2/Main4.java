package exercicio_2;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. 
		// A seguir calcule a duração do jogo, 
		// sabendo que o mesmo pode começar em um dia e terminar em outro, 
		// tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int HI, HF, tempo;
		
		Scanner sc = new Scanner(System.in);
		
		HI = sc.nextInt();
	    HF = sc.nextInt();
		
	   
	    
	    
	    if(HI >= HF) {
	    	tempo =  HF - HI;
	    } else {
	    	tempo = 24 - HI + HF;
	    }
		
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		sc.close();

	}

}
