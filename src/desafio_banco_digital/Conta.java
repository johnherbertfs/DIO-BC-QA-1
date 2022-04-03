package desafio_banco_digital;

public abstract class Conta {
	
	protected long numero;
	protected Agencia agencia;
	protected Pessoa cliente;
	protected double saldo;
	protected String estadoAtivacao;
	protected long PREFIXO = 002;
	private static long contadorConta = 1000;
	
	
	public Conta(Agencia agencia, Pessoa cliente) {
		this.numero = contadorConta + 1;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	
	public String verificaAtivacao() {
		return estadoAtivacao;
	}

	public void setAtivacao(String ativacao) {
		this.estadoAtivacao = ativacao;
	}

	public long getNumero() {
		return numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	protected boolean depositar(double valor) {
		 if(estadoAtivacao.equalsIgnoreCase("ativa")) {
			 this.saldo += valor;
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
	public boolean sacar(double valor) {
		 if(saldo >= valor && estadoAtivacao.equalsIgnoreCase("ativa")) {
			 this.saldo -= valor;
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
	/*public String toString() {
		String dados = "Nome Empresarial:  " + this.nome + "\nNome Fantasia: " + this.nomeFantasia + 
						"\nEndereco Titular: " + this.endereco + "\nEmail do Titular: " + this.email + 
						"\nCNPJ do Titular: " + this.cnpj +
						"Saldo Atual: " + conta.getSaldo();
		return dados;
	}*/

	
}




