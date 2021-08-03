
public class Triciclo extends Veiculo implements Tributavel{

	@Override
	public Double calculaValorImposto() {
		// TODO Auto-generated method stub
		return super.preco * 0.2;
	}

}
