package desafios_gft_qa1;

import java.util.Scanner;

public class EncaixaOuNao1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("digite o número de interações:  ");
		int vezesInteracoes = scan.nextInt(); scan.nextLine();
		
		String num1;
		String num2;
		
		for(int i = 0; i < vezesInteracoes; i++) {
			//System.out.println("digite o primeiro número:  ");
			num1 = scan.nextLine();
			//System.out.println("digite o segundo número:  ");
			num2 = scan.nextLine();
			
			int tamanhoNum1 = num1.length() - 1;
			int tamanhoNum2 = num2.length() - 1;
			//tamanhoNum2 -= 1;			
			if(tamanhoNum1 < tamanhoNum2) {
				System.out.println("nao encaixa");
				continue;
			} else {
				
				while(true) {
					if(num1.charAt(tamanhoNum1) == num2.charAt(tamanhoNum2)) {
						tamanhoNum1--;
						tamanhoNum2--;
						if(tamanhoNum2 < 0) {
							System.out.println("encaixa");
							break;
						} else {
							continue;
						}
					}else {
						System.out.println("nao encaixa");
						break;
					}
				}
			}
		}
		//System.out.println("FIM!!!");
		scan.close();

	}

}
