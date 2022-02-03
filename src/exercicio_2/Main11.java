package exercicio_2;

public class Main11 {

	public static void main(String[] args) {
		
		int resultado;
		
		int func(int x, int y) {
			if(y == 0) {
				return x;
			} else {
				return func(y, x % y);
			}
		}	
		System.out.println("Resultado" + Func(9,3));
	}
	
	
}
