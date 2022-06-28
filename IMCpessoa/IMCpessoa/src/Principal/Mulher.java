package Principal;


public class Mulher extends IMCpessoa{

	public Mulher(String nome, String DataNascimento, double peso_, double altura_) {
		super(nome, DataNascimento, peso_, altura_);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void ResultIMC() {
		// TODO Auto-generated method stub

		double IMC = CalculaIMC (this.getPeso(), this.getAltura());
		
		
		if (IMC < 19) {
			System.out.println("Abaixo do peso ideal");
		}
		else if (IMC <= 25.8) {
			
			System.out.println("Peso ideal");
			
		}
		else if (IMC > 25.8) {
			
			System.out.println("Acima do peso ideal");
		}
		
		
	}
	
	
	

}
