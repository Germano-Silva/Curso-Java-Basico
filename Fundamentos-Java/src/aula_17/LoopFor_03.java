package aula_17;

public class LoopFor_03 {
    @SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		int count =0;
		for (; count < 5;) {
			System.out.println("Valor de count: "+ count);
			count +=2;
			
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de count: "+ cont);
		}
		
		//loop infinito for(;;);
		
		//loop sem corpo
		 int soma = 0;
		 for(int i =0; i<5; soma+= i++);
		 System.out.println("O valor da soma é:" + soma);
		 //sempre será aexecutado somente a primeira linha depois do corpo do loop
	}
}
