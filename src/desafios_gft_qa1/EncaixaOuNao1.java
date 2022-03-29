package desafios_gft_qa1;

import java.util.Scanner;

public class EncaixaOuNao1 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o número de interações:  ");
		int vezesInteracoes = scan.nextInt(); scan.nextLine();
		
		String num1;
		String num2;
		String teste = null;
		
		for(int i = 0; i < vezesInteracoes; i++) {
			System.out.println("digite o primeiro número:  ");
			num1 = scan.nextLine();
			System.out.println("digite o segundo número:  ");
			num2 = scan.nextLine();
			
			int tamanhoNum2 = num2.length();
			int j = tamanhoNum2 - 1;
			
			for(; ; --j) {
				if(num1.charAt(j) == num2.charAt(j)) {
					teste = "encaixa";
					continue;
				}
				else {
					teste = "nao encaixa";
					break;
				}
			}
			if(teste.equalsIgnoreCase("encaixa")) {
				System.out.println(teste);
			}
			else {
				System.out.println(teste);
			}
		}
		System.out.println("FIM!!!");
		
		/*
		 * 
		--- 0 1 2 3 4
		
		5 6 7 8 6 9 0
		    7 8 6 9 0
		*/

	}

}
