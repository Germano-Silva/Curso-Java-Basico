package aula_17;

public class LoopFor_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0, j=10; i < j; i++, j--) {
			System.out.println("i = "+i+" ; j = "+j);
		}
		
		for (int i = 0, j=10; i <= j; i++, j--) {
			System.out.println("i = "+i+" ; j = "+j);
		}
	}

}
