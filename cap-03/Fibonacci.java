class Fibonacci {
	public static void main (String[] args) {
		int i = 0;
		int j = 1;
		int c = 1;
		int aux;
			while (c <= 10) {
				i += j; 
				aux = j;
				j += aux;
				c++; 
			}
	}
}