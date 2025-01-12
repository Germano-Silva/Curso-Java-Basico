package aula_19;

public class Array_01 {

	public static void main(String[] args) {
		double[] temperatura = new double[365];
		temperatura[0] = 31.3;
		System.out.println("O valor da temperatura dia 1 = "+ temperatura[0]);
		System.out.println("Qual o tamanho o array: "+ temperatura.length);
		System.out.println("Endereço de memoria do array: "+ temperatura);
		
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura dia "+(i+1)+" = "+ temperatura[i]);
		}
		
		for(double temp:temperatura) {
			System.out.println("O valor da temperatura dia " + temp);
		}
	}

}
