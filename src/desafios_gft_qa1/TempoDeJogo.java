package desafios_gft_qa1;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int duracao;
		
		System.out.println("digite a hora de inicio do jogo [formato 24h]:  ");
		int inicio = scan.nextInt();
		System.out.println("digite a hora do fim do jogo [formato 24h]:  ");
		int fim = scan.nextInt();
		
		duracao = 24 - inicio + fim;
		
		if(duracao == 24) {
			
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
		else if(duracao > 24) {
			duracao -= 24;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
		scan.close();
	}

}
