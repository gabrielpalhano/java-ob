class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		//Meu	programa	pode	manter	na	memória	uma	ou	mais	de	uma	conta:
		
		Conta meuSonho = new Conta();
		meuSonho.saldo = 150000;
		
		//System.out.println(meuSonho.saldo);
		
		minhaConta.titular = "Yuqi";
		minhaConta.saldo = 1000.0;
		
		boolean consegui = minhaConta.sacar(2000);
		//minhaConta.depositar(500);
		
		
		/*if(consegui) {
			System.out.println("O saldo atual da conta do titular: " + minhaConta.titular + ", é de: " + minhaConta.saldo + "!");
		} else {
			System.out.println ("Seu saldo atual de: " + minhaConta.saldo + " não é suficiente!");
		}*/
		
		//Ou eu posso não fazer uso de uma var auxiliar:
		
		if (minhaConta.sacar(2000)) {
			System.out.println("O saldo atual da conta do titular: " + minhaConta.titular + ", é de: " + minhaConta.saldo + "!");
		} else {
			System.out.println ("Seu saldo atual de: " + minhaConta.saldo + " não é suficiente!");
		}
		/*Mais	 adiante,	 veremos	 que,	 algumas	 vezes,	 é	 mais	 interessante	 lançar	 uma	 exceção	 (exception)
		nesses	casos. */
		
		
	}
}