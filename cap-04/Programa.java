class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;
		
		//Meu	programa	pode	manter	na	memória	uma	ou	mais	de	uma	conta:
		
		Conta meuSonho = new Conta();
		meuSonho.saldo = 150000;
		
		//System.out.println(meuSonho.saldo);
		
		minhaConta.titular.nome = "Yuqi";
			System.out.println(minhaConta.titular.nome);
		minhaConta.saldo = 3000.0;
			//System.out.println(minhaConta.saldo);
		
		//boolean consegui = minhaConta.sacar(2000.0);
		//minhaConta.depositar(3000);
		
		meuSonho.transferir(minhaConta, 50000);
			System.out.println(minhaConta.saldo);
		
		/*if(consegui) {
			System.out.println("O saldo atual da conta do titular: " + minhaConta.titular + ", é de: " + minhaConta.saldo + "!");
		} else {
			System.out.println ("Seu saldo atual de: " + minhaConta.saldo + " não é suficiente!");
		}*/
		
		//Ou eu posso não fazer uso de uma var auxiliar:
		
		if (minhaConta.sacar(2000.0)) {
			System.out.println("O saldo atual da conta do titular: " + minhaConta.titular.nome + ", é de: " + minhaConta.saldo + "!");
		} else {
			System.out.println ("Seu saldo atual de: " + minhaConta.saldo + " não é suficiente!");
		}
		/*Mais	 adiante,	 veremos	 que,	 algumas	 vezes,	 é	 mais	 interessante	 lançar	 uma	 exceção	 (exception)
		nesses	casos. */
		
		
	}
}