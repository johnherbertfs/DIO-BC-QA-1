package desafios_gft_qa1;

import java.util.Scanner;

public class EncaixaOuNao2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iteracoes = scan.nextInt(); scan.nextLine();
		
		String n1;
		String n2;
		
		for(int i = 0; i < iteracoes; i++) {
			n1 = scan.nextLine();
			n2 = scan.nextLine();
			
			int tamanhoN1 = n1.length();
			int tamanhoN2 = n2.length();
	
			if(tamanhoN1 < tamanhoN2) {
				System.out.println("nao encaixa");
				continue;
			} else {

				int inicio = tamanhoN1 - tamanhoN2;
				int fim = n1.length();
				String sub = n1.substring(inicio, fim);
				
				if(n2.equalsIgnoreCase(sub)) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
		}
		scan.close();
	}

}
