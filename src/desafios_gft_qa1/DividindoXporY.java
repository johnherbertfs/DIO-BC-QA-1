package desafios_gft_qa1;

import java.util.Scanner;

public class DividindoXporY {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o número de interações:  ");
		int vezesInteracoes = scan.nextInt();
		
		float num1;
		float num2;
		
		for(int i = 0; i < vezesInteracoes; i++) {
			System.out.println("digite o primeiro número:  ");
			num1 = scan.nextInt();
			System.out.println("digite o segundo número:  ");
			num2 = scan.nextInt();
			
			if(num2 <= 0) {
				System.out.println("divisão impossível!");
			}
			else {
				float resultado = num1 / num2;
				System.out.printf("divisão do primeiro pelo segundo número:  %.01f", resultado);
				System.out.println();
			}
		}
		System.out.println("FIM!!!");

	}

}
