
public class CalculadoraDeImposto {
	
	private Double imposto = 0.00;

	public void calcula(Tributavel tributavel) {
		this.imposto += tributavel.calculaValorImposto();
	}

	public Double getImposto() {
		return imposto;
	}
	
}
