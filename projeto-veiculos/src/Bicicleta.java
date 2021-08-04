
public class Bicicleta extends Veiculo{
	
	@Override
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.getPreco() * 0.6;
		System.out.println("Estamos dentro do metodo. O valor com desconto fica: " + valorComDesconto);
		return valorComDesconto;
	}

	
}
