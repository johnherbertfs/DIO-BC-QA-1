package desafios_gft_qa1;

import java.util.Scanner;

public class SaoMultiplos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero:  ");
		int n1 = scan.nextInt();
		System.out.println("digite o segundo numero:  ");
		int n2 = scan.nextInt();
		
		if((n2%n1) == 0 || (n1%n2) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
		scan.close();
	}

}
