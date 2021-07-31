
public class Moto extends Veiculo {

	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.preco * 0.8;
		System.out.println("O valor da moto com desconto é: " + valorComDesconto);
		return valorComDesconto;
	}
}
