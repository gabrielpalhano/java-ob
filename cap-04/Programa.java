class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Yuqi";
		minhaConta.saldo = 1000.0;
		
		boolean consegui = minhaConta.sacar(2000);
		//minhaConta.depositar(500);
		
		
		if(consegui) {
			System.out.println("O saldo atual da conta do titular: " + minhaConta.titular + ", é de: " + minhaConta.saldo + "!");
		} else {
			System.out.println ("Seu saldo atual de: " + minhaConta.saldo + " não é suficiente!");
		}
	}
}