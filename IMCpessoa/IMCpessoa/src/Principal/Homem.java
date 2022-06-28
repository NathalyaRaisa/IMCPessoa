package Principal;


public class Homem  extends IMCpessoa{

	public Homem(String nome, String DataNascimento, double peso_, double altura_) {
		super(nome, DataNascimento, peso_, altura_);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void ResultIMC() {
		// TODO Auto-generated method stub

		double IMC = CalculaIMC (this.getPeso(), this.getAltura());
		
		
		if (IMC < 20.7) {
			System.out.println("Abaixo do peso ideal");
		}
		else if (IMC <= 26.4) {
			
			System.out.println("Peso ideal");
			
		}
		else if (IMC > 26.4) {
			
			System.out.println("Acima do peso ideal");
		}
		
		
	}
	
	
	

}
