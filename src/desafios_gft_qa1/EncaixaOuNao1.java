package desafios_gft_qa1;

import java.util.Scanner;

public class EncaixaOuNao1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o número de interações:  ");
		int iteracoes = scan.nextInt(); scan.nextLine();
		
		String n1;
		String n2;
		
		for(int i = 0; i < iteracoes; i++) {
			System.out.println("digite o primeiro número:  ");
			n1 = scan.nextLine();
			System.out.println("digite o segundo número:  ");
			n2 = scan.nextLine();
			
			int tamanhoN1 = n1.length() - 1;
			int tamanhoN2 = n2.length() - 1;
			//tamanhoNum2 -= 1;			
			if(tamanhoN1 < tamanhoN2) {
				System.out.println("nao encaixa");
				continue;
			} else {
			/*	while(true) { 
					if(n1.charAt(tamanhoN1) == n2.charAt(tamanhoN2)) {
						tamanhoN1--;
						tamanhoN2--;
						if(tamanhoN2 < 0) {
							System.out.println("encaixa");
							break;
						} else {
							continue;
						}
					}else {
						System.out.println("nao encaixa");
						break;
					}
				} */
					
				int inicio = tamanhoN1 - tamanhoN2;
				int fim = tamanhoN1 - 1;
				
				System.out.println("string completa:  " + n1);
				System.out.println("sub string:  " + n1.substring(inicio, fim));
					
			}
		}
		scan.close();
	}

}
