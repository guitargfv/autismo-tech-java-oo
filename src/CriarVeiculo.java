
public class CriarVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeiculoAntigo primeiroVeiculo = new VeiculoAntigo();
		primeiroVeiculo.modelo = "Gol";
		VeiculoAntigo segundoVeiculo = new VeiculoAntigo();
		segundoVeiculo.modelo = "Palio";
		System.out.println("Modelo do nosso primeiro Veiculo: " + primeiroVeiculo.modelo);
		System.out.println("Modelo do nosso segundo Veiculo: " + segundoVeiculo.modelo);
	}

}
