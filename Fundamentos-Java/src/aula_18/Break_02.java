package aula_18;

import java.util.Scanner;

public class Break_02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			for(int i = 0; i<=4; i++) {
				r1:{
					r2:{
						r3:{
							if (i==1) {
								break r1;
							}
							if (i==2) {
								break r2;
							}
							if (i==3) {
								break r3;
							}
							System.out.println("rotulo3");
						}
						System.out.println("rotulo2");
					}
					System.out.println("rotulo1");
				}
				System.out.println("dentro do for i = "+ i);
			}
		}

	}

}
