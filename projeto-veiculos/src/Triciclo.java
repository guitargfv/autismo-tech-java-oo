

// Um triciclo é um veiculo que é tributavel

public class Triciclo extends Veiculo implements Tributavel {

	@Override
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.getPreco() * 0.6;
		System.out.println("Estamos dentro do metodo. O valor com desconto fica: " + valorComDesconto);
		return valorComDesconto;
	}

	@Override
	public Double calculaValorImposto() {
		// TODO Auto-generated method stub
		return super.getPreco() * 0.1;
	}

}
