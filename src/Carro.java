
public class Carro extends VeiculoTributavel {

	// Criado para exemplificar problema de tipo mais especifico
	private boolean motorLigado;

	// utilizando metodo da classe pai dentro do nosso metodo sobrescrito
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.calculoDeValorComDesconto() * 0.9;
		System.out.println("O valor da moto com desconto é: " + valorComDesconto);
		return valorComDesconto;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void ligar() {
		this.motorLigado = true;
	}

	public void desligar() {
		this.motorLigado = false;
	}

	@Override
	public Double calculaTributo() {
		// TODO Auto-generated method stub
		return this.preco * 0.1;
	}

}
