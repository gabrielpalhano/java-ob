class Conta {
	int numero;
	double saldo;
	double limite;
	String titular;
	
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
}