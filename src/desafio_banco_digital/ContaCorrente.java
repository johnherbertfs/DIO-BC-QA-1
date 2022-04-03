package desafio_banco_digital;

public class ContaCorrente extends Conta {
	
	
	
	public long getPREFIXO() {
		return PREFIXO;
	}


	public ContaCorrente(Agencia agencia, Pessoa cliente) {
		super(agencia, cliente);
		this.estadoAtivacao = "ativa";
		this.PREFIXO = 001;
	}
	
	
	public boolean transferir(Conta destino, double valor) {
		if(this.estadoAtivacao.equalsIgnoreCase("ativa") && this.saldo >= 0) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
}
