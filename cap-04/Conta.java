class Cliente {
	String nome;
	String sobrenome;
	String cpf;
}

class Conta {
	int numero;
	double saldo;
	double limite;
	Cliente titular;
	
	boolean sacar(double valor) {
		
		if(this.saldo < valor) {  // Validação que servirá para verificar se o cliente tem saldo suficiente!
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void depositar(double qtd) {
		this.saldo += qtd;
	}
	
	void transferir(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
		
	/* boolean	retirou	= this.sacar(valor);
			if	(retirou ==	false)	{
				//	não	deu	pra	sacar!
				return false;
			}
			else{destino.depositar(valor);
				return true;
			} */
	}
}