class ExAulaTresJd {
	public static void main (String[] args) {
		int idade = 30;
			if (idade >= 5 && idade <= 10) {
				System.out.println("O atleta com idade: " + idade + " anos, se encaixa na categoria Infantil!");
			} else if(idade >= 11 && idade <= 15) {
				System.out.println("O atleta com idade: " + idade + " anos, se encaixa na categoria Juvenil!");
			} else if(idade >= 16 && idade <= 20) {
				System.out.println("O atleta com idade: " + idade + " anos, se encaixa na categoria Junior!");
			} else if (idade >= 21 && idade <= 25) {
				System.out.println("O atleta com idade: " + idade + " anos, se encaixa na categoria Profissional!");
			} else {
				System.out.println("Infelizmente, o atleta com idade: " + idade + " anos, está fora da faixa etária que procuramos!");
			}
	}
}

/* Um determinado clube de futebol pretende classificar seus atletas em
categorias e para executar esta tarefa foi contratado um programdor
para isso o clube criou uma tableta que continha a faixa etária do atleta
e sua categoria:
    IDADE    CATEGORIA
 De 05 a 10  INFANTIL
 De 11 a 15  JUVENIL
 De 16 a 20  JUNIUR
 De 21 a 25  PROFISSIONAL
Construa um programa que solicite o nome e a idade de um atleta e imprima
a sua categoria; caso não seja de nenhuma categoria exiba a mensagem:
"Infelizmente o atleta está fora da faixa etária que procuramos!" */