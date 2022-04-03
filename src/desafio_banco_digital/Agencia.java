package desafio_banco_digital;

import java.util.ArrayList;

public class Agencia {
	
	private String nome;
	private long numero;
	private String endereco;
	private ArrayList<Conta> contas;
	
	private static long contadorAgencia = 0;
	
	
	public Agencia(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = contadorAgencia + 1;
		this.contas = new ArrayList<Conta>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getNumero() {
		return numero;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public void criarNovaContaCorrente(Pessoa pessoa) {
		Conta novaConta = new ContaCorrente(this, pessoa);
		contas.add(novaConta);
	}
	
	public void criarNovaContaPoupanca(Pessoa pessoa) {
		Conta novaConta = new ContaCorrente(this, pessoa);
		contas.add(novaConta);
	}
	
	public String inativarConta(Conta conta) {
		if(conta.estadoAtivacao.equalsIgnoreCase("ativa")) {
			conta.setAtivacao("inativa");
			return "Conta inativada";
		} else {
			return "Conta já estava inativa";
		}
	}
	
	
	public String getContas() {
		String dados = "\nAgencia: " + this.numero + "\n" + this.nome + "\n" + this.endereco + "\n";
		dados.concat("Contas existentes:  \n");
		for(Conta c : contas) {
			dados.concat("Numero: " + c.PREFIXO + " " + c.numero + " - " + c.estadoAtivacao + "\n");
		}
		return dados;
	}
	

}





