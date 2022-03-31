package mais_desafios_gft_qa1;

import java.util.Scanner;

public class DomingoManha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite uma hora:  ");
		String horario[] = scan.nextLine().split(":");
		
		System.out.println("hora digitada:  hora " + horario[0] + ", minuto " + horario[1]);
		
		
		switch(horario[0]) {
			case("7"): System.out.println("Atraso maximo: " + horario[1]); break;
			case("8"): System.out.println("Atraso maximo: " + horario[1]); break;
			case("9"): System.out.println("Atraso maximo: " + horario[1]); break;
			default:  System.out.println("Atraso maximo: 0");
		}
		
		
		scan.close();

	}

}
