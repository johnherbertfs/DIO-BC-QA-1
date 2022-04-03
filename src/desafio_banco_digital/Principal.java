package desafio_banco_digital;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	

	public static void main(String[] args) {
	
		Pessoa pe1 = new PeFisica("Joao Maria", "Rua do Amazonas, 1005, Distrito Central 1", "jm@mail.com", "123456789-55");
		Pessoa pe2 = new PeFisica("Maria das Neves", "Rua do Acre, 1006, Distrito Central 1", "mn@mail.com", "123456789-66");
		Pessoa pe3 = new PeFisica("Jose da Silva", "Rua do Amapa, 1007, Distrito Central 2", "js@mail.com", "123456789-77");
		Pessoa pe4 = new PeFisica("Mariana Leite", "Rua do Roraima, 1008, Distrito Central 2", "ml@mail.com", "123456789-88");
		
		Agencia ag1 = new Agencia("Agencia do Distrito Central 1", "Distrito Central 1");
		agencias.add(ag1);
		Agencia ag2 = new Agencia("Agencia do Distrito Central 2", "Distrito Central 1");
		agencias.add(ag2);
		
		
		ag1.criarNovaContaCorrente(pe1);
		ag1.criarNovaContaCorrente(pe2);
		
		ag2.criarNovaContaPoupanca(pe3);
		ag2.criarNovaContaPoupanca(pe4);
		
		
		
		telaPrincipal();
	}
	
	
	public static void telaPrincipal() {
		System.out.println("========== Tela de Acoes do Banco Nao Central ==========");
		System.out.println(" +1:  Ver Todas as Contas das Agencias");
		System.out.println(" +2:  Criar nova conta");
		
		int opcao = scan.nextInt();
		
		switch (opcao) {
		case 1: verContasAgencias(); break;
		case 2: criarContaFisica(); break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}
	
	private static void verContasAgencias() {
		for(Agencia a : agencias) {
			System.out.println(a.getContas());
		}
		
	}


	public static void criarContaFisica() {
		scan.nextLine();
		System.out.print("digite o nome do titular:  ");
		String nome = scan.nextLine();
		System.out.print("digite o endereco do titular:  ");
		String endereco = scan.nextLine();
		System.out.print("digite o email do titular:  ");
		String email = scan.nextLine();
		System.out.print("digite o CPF do titular:  ");
		String cpf = scan.nextLine();
		System.out.print("digite 1 - para criar conta corrente; ou 2 - para conta poupancar:  ");
		String tipoConta = scan.nextLine();
		/*if(tipoConta.equalsIgnoreCase("1"))
			Conta conta = new ContaCorrente(null, null);*/
	}

	
	
	
	
	
}
