
public class CalculadoraDeImposto {

	private Double imposto = 0.00;

	public void calculo(Tributavel tributavel) {
		this.imposto = this.imposto + tributavel.calculaValorImposto();
	}

	public Double getImposto() {
		return this.imposto;
	}

}
