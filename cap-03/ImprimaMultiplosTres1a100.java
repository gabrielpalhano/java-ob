class ImprimaMultiplosTres1a100 {
	
	public static void main (String[] args) {
		int dividendo;
		int divisor;
			for (dividendo = 1, divisor = 3; dividendo <= 100; dividendo++) {
				if (dividendo % divisor == 0) {
					System.out.println(dividendo);
				}
			}
			
// MANEIRA WHILE DE FAZER:		
		/*int dividendo = 1;
		int divisor = 3;
			while (dividendo <= 100) {
				if (dividendo % divisor == 0) {
					System.out.println(dividendo);
				}
			dividendo++;
			} */
			
	}
}

//3.	 Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.