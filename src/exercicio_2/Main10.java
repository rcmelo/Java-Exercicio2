package exercicio_2;

public class Main10 {

	public static void main(String[] args) {

		int [] v = {1,2,3,4,5,6,7,8,9,10};
		boolean temValoresRepetidos;
		int i, j;
		
		
		v[1] = 1;
		v[2] = 2;
		v[3] = 3;
		v[4] = 4;
		v[5] = 5;
		v[6] = 6;
		v[7] = 7;
		v[8] = 8;
		v[9] = 9;
		//v[10] = 10;
		
		temValoresRepetidos = false;
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j > 1; i--) {
				if (v[i] == v[j]) {
					temValoresRepetidos = true;
				}
			}
		}
		System.out.println(temValoresRepetidos);
	
	}
}	