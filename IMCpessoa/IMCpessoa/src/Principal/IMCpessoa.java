package Principal;



public abstract class IMCpessoa extends Pessoa {
	
	
	private double peso;
	private double altura;
	
	
	public IMCpessoa(String nome, String DataNascimento, double peso_, double altura_) {
		super(nome, DataNascimento);
		
		
		setPeso(peso_);
		setAltura(altura_);
		
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "IMCpessoa peso=" + this.peso + "\n" + "altura=" + this.altura + "\n" + "Nome =" + this.getNome() + "\n" + "Data Nascimento ="
				+ this.getDataNascimento() ;
		
		
		
		
	}

	public double CalculaIMC(double peso_, double altura_) {
		
		double IMC = 0;
		IMC = this.peso / (this.altura * this.altura);
		
		return IMC;
	}
	
	
	public abstract void ResultIMC();

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
