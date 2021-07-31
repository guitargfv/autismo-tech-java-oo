
public class Bicicleta extends Veiculo {

	Bicicleta() {
		super();
	}

	
//	Metodo criado para mostrar sobrescrita de metodos na classe filha. Boa para explicar sobrescrita no polimorfismo
	@Override
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = super.preco * 0.6;
		System.out.println("O valor da bike com desconto é: " + valorComDesconto);
		return valorComDesconto;
	}
}
