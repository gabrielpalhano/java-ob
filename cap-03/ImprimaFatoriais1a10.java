class ImprimaFatoriais1a10 {
	
	public static void main (String[] args) {
		long n;
		long f;
			for (n = 1, f = 1; n <= 20; n++) {
				f += f*(n-1);
					System.out.println(f);
			}
			
		
// MANEIRA WHILE DE RESOLVER:		
		/* int f = 1;
		int n = 1;
			while (n <= 10) {
				f += f*(n-1);
				System.out.println(f);
				n++;
			} */
	}
}

/* 4.	 Imprima	os	fatoriais	de	1	a	10.
O	fatorial	de	um	número	n	é	n	*	(n-1)	*	(n-2)	*	...	*	1.	Lembre-se	de	utilizar	os	parênteses.
O	fatorial	de	0	é	1
O	fatorial	de	1	é	(0!)	*	1	=	1
O	fatorial	de	2	é	(1!)	*	2	=	2
O	fatorial	de	3	é	(2!)	*	3	=	6
O	fatorial	de	4	é	(3!)	*	4	=	24
Faça	um	for	que	inicie	uma	variável	n	(número)	como	1,	fatorial	(resultado)	como	1	e	varia	n	de	1
até	10:
int	fatorial	=	1;
for	(int	n	=	1;	n	<=	10;	n++)	{
	}

5.	 No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos
até	20,	30	e	40.	Em	um	determinado	momento,	além	de	esse	cálculo	demorar,	começará	a	mostrar
respostas	completamente	erradas.	Por	quê?
Mude	de		int		para		long		a	fim	de	ver	alguma	mudança.
	
*/
	
	

