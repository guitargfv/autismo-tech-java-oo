
public class VolumeDeVendas {

	private Double soma;

	public VolumeDeVendas() {
		this.soma = 0.0;
	}

	public void registra(Veiculo veiculo, boolean desconto) {
		if (desconto) {
			soma += veiculo.calculoDeValorComDesconto();
		} else {
			soma += veiculo.getPreco();
		}
	}

	public Double getSoma() {
		return soma;
	}

	
}
