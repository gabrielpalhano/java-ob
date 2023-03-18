class Teste {
	public static void main (String[] args) {
		double dist = 5;
		double cons = 5;
		double vlrLitro = 5;
		double vlrGasto = vlrLitro*cons;
		
		
		
		System.out.println("Ao percorrer: " + dist + " Km/h, \nvocê terá gasto: " + (String.format("%.2f", vlrGasto)) + " reais!");
	}
}