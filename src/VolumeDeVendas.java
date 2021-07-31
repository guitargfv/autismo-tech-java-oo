
public class VolumeDeVendas {
	
	private Double soma;
	
	public VolumeDeVendas() {
		this.soma = 0.00;
	}
	
	public void registra(Veiculo veiculo, boolean desconto) {
		if(desconto) {
			soma += veiculo.calculoDeValorComDesconto();
		} else {
			soma += veiculo.preco;
		}
	}
	
//	public void registra(Carro carro, boolean desconto) {
//		if(desconto) {
//			soma += carro.calculoDeValorComDesconto();
//		} else {
//			soma += carro.preco;
//		}
//	}
//	
//	public void registra(Moto moto, boolean desconto) {
//		if(desconto) {
//			soma += moto.calculoDeValorComDesconto();
//		} else {
//			soma += moto.preco;
//		}
//	}
//	
//	public void registra(Bicicleta bicicleta, boolean desconto) {
//		if(desconto) {
//			soma += bicicleta.calculoDeValorComDesconto();
//		} else {
//			soma += bicicleta.preco;
//		}
//	}
	
	

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}
	
	
}
