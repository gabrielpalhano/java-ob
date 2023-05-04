import java.util.Scanner;

class Teste {
	public static void main (String[] args) {
	/*	Scanner leia = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite sua nota: ");
		float nota = leia.nextFloat(); 
		System.out.printf("A nota do aluno %s eh de: %.2f", nome, nota); */
		
		float n1;
		float n2;
		double media;
		String nome;
		
	/*	Scanner leia = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		nome = leia.nextLine();
		System.out.print("Digite a nota do primeiro bimestre: ");
		n1 = leia.nextInt();
		System.out.print("Digite a nota do segundo bimestre: ");
		n2 = leia.nextInt();
		media = ((n1 + n2) / 2);
		
		//System.out.println("A media do aluno: " + nome + " eh de: " + media);
		System.out.printf("A media do aluno %s eh de %.1f", nome, media); */
		
	/*	int idade = 25;
		String valor = Integer.toString(idade); */
		
		String valor = "25";
		int idade = Integer.parseInt(valor);
		
		System.out.println(idade);
	}
}