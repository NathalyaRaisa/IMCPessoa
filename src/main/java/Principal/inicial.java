package Principal;

import java.util.Scanner;

public class inicial {

	public static void main(String[] args) {

		int a = 2, i = 0;
		int sh = 0;
		String sa = null, sb = null;
		double sc = 0, sd = 0;
		Scanner sInt = new Scanner(System.in);
		Scanner sTxt = new Scanner(System.in);
		Scanner sDoub = new Scanner(System.in);

		System.out.println( "Digite um número inteiro \n" 
		+ "Que você deseje que seja o tamanho do vetor" );
		a = sInt.nextInt();

		IMCpessoa[] armazem = new IMCpessoa[a];

		while (i < a) {

			System.out.println( "Seu registro é de Homem ou de Mulher? \n" );
			System.out.println( "Digite 1 para Homem e 2 para Mulher. \n" );

			sh = sInt.nextInt();

			if (sh == 1) {

				System.out.println( "Digite o nome" );
				sa = sTxt.nextLine();
				System.out.println( "Digite a data de nascimento" );
				sb = sTxt.nextLine();
				System.out.println( "Digite o peso" );
				sc = sDoub.nextDouble();
				System.out.println( "Digite altura" );
				sd = sDoub.nextDouble();

				armazem[i] = new Homem(sa, sb, sc, sd);
			}

			else if (sh == 2) {

				System.out.println( "Digite o nome \n" );
				sa = sTxt.nextLine();
				System.out.println( "Digite a data de nascimento \n" );
				sb = sTxt.nextLine();
				System.out.println( "Digite o peso \n" );
				sc = sDoub.nextDouble();
				System.out.println( "Digite altura \n" );
				sd = sDoub.nextDouble();

				armazem[i] = new Mulher(sa, sb, sc, sd);
			}

			else {
				System.out.println( "Opção inválida \n" );
				System.out.println( "Reinicie o programa \n" );

				System.exit(i);
			}
			i++;
		}

		System.out.println(armazem[0].toString());
		armazem[0].ResultIMC();
		sInt.close();
		sDoub.close();
		sTxt.close();

	}

}
