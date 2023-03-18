class ExUm {
	public static void main (String[] args) {
		double jan = 15.000;
		double fev = 23.000;
		double mar = 17.000;
		double despesaTotal = jan + fev + mar;
		double mediaMensal = despesaTotal / 3;
		
			System.out.println("A despesa total no trimestre foi de: " + (String.format("%.3f", despesaTotal)) + "\nA média trimestral de gasto é de: " + (String.format("%.3f", mediaMensal)));
		
	}
}

/* Na	 empresa	 em	 que	trabalhamos,	 há	tabelas	 com	 o	 gasto	 de	 cada	 mês.	 Para	 fechar	 o	 balanço	 do
primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 gastos	 15	mil
reais,	em	fevereiro,	23	mil	reais	e,	em	março,	17	mil	reais,	faça	um	programa	que	calcule	e	imprima
a	despesa	total	no	trimestre	e	a	média	mensal	de	gastos. */