
public class CriarVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VeiculoAntigo primeiroVeiculo = new VeiculoAntigo();
		primeiroVeiculo.modelo = "Gol";
		VeiculoAntigo segundoVeiculo = new VeiculoAntigo();
		segundoVeiculo.modelo = "Palio";
		System.out.println("Modelo do nosso primeiro Veiculo: " + primeiroVeiculo.modelo);
		System.out.println("Modelo do nosso segundo Veiculo: " + segundoVeiculo.modelo);

		Carro meuPrimeiroCarro = new Carro();
		meuPrimeiroCarro.setCor("Azul");
		System.out.println(meuPrimeiroCarro.getCor());
		
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		Bicicleta b1 = new Bicicleta();
		
		c1.setPreco(100000.00);
		m1.setPreco(100000.00);
		b1.setPreco(100000.00);
		
		c1.calculoDeValorComDesconto();
		m1.calculoDeValorComDesconto();
		b1.calculoDeValorComDesconto();

		System.out.println(Veiculo.getTotal());
		
		VolumeDeVendas v1 = new VolumeDeVendas();
		v1.registra(c1, false);
		v1.registra(m1, true);

		System.out.println(v1.getSoma());
		
//		Polimorfismo - utilizando um tipo masi generico
		Veiculo poliVeiculo = new Carro();
		
//		Não funciona por ser de timo generico, utilizando casting para corrigir o problema na força
//		poliVeiculo.ligar();
		Carro meuCarro = (Carro) poliVeiculo;
		meuCarro.ligar();
		System.out.println(meuCarro.isMotorLigado());
		meuCarro.desligar();
		System.out.println(meuCarro.isMotorLigado());
		
		
		
		
		
	}

}
