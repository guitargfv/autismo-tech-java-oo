
public class Moto extends VeiculoAutomotor{
	
	
	@Override
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.getPreco() * 0.8;
		System.out.println("Estamos dentro do metodo. O valor com desconto fica: " + valorComDesconto);
		return valorComDesconto;
	}
}
