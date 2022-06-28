package Principal;
import java.util.Scanner;

public class inicial {

	public static void main ( String[] args){
		
		
		int a = 2, i = 0;
		int sh = 0;
		String sa = null, sb = null; 
		double sc = 0, sd = 0;
		Scanner sInt = new Scanner(System.in);
		Scanner sTxt = new Scanner(System.in);
		Scanner sDoub = new Scanner(System.in);
		
		
		System.out.println("Digite um número inteiro"+"\n"+"Que você deseje que seja o tamanho do Vetor");
		a = sInt.nextInt();
		
		IMCpessoa[] armazem  = new IMCpessoa[a];
		
		System.out.println("\n"+"\n");

		
		while (i < a){
			
		
		System.out.println("\n"+"\n");
		
		System.out.println("\n"+"Seu registro é de Homem ou de Mulher ?");
		System.out.println("Digite 1 para Homem e 2 para Mulher");

			sh = sInt.nextInt();

			if (sh == 1) {
				
			System.out.println("\n"+"Digite o nome");
				sa =  sTxt.nextLine();
			System.out.println("\n"+"Digite a data de nascimento");
				sb =  sTxt.nextLine();
			System.out.println("\n"+"Digite o peso");
				sc =  sDoub.nextDouble();
			System.out.println("\n"+"Digite altura");
				sd =  sDoub.nextDouble();
				
				armazem[i] = new Homem(sa, sb , sc, sd);
			}
			
			else if (sh == 2) {
				
			System.out.println("\n"+"Digite o nome");
				sa =  sTxt.nextLine();
			System.out.println("\n"+"Digite a data de nascimento");
				sb =  sTxt.nextLine();
			System.out.println("\n"+"Digite o peso");
				sc =  sDoub.nextDouble();
			System.out.println("\n"+"Digite altura");
				sd =  sDoub.nextDouble();
				
				armazem[i] = new Mulher(sa, sb , sc, sd);
			}			
			
			else {
				System.out.println("Opção inválida");
				System.out.println("Reinicie o programa");

				System.exit(i);
			}
			i++;
			}
			
			System.out.println("\n"+"\n"+"\n");
		
			System.out.println(armazem[0].toString());
			armazem[0].ResultIMC();
			
			

		}
	

	
	

		 
		 
		 
		
		
			
	
	
}
