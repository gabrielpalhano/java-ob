class Teste {
	
	public static void main (String[] args) {
		int fibo = 10;
		int i;
		int j;
		int aux;
		
			for(i = 0; i <= fibo; i++) {
				for (j = i + 1; j < fibo; j++) {
					
						aux = j;
						i += j;
						j = aux;
							System.out.println(i);
							
				}		
			}
	}
}