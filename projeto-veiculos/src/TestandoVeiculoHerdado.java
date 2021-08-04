
public class TestandoVeiculoHerdado {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		Moto m1 = new Moto();
		Bicicleta b1 = new Bicicleta();

		c1.setMarca("VW");

		c1.setPreco(100.00);
		m1.setPreco(100.00);
		b1.setPreco(100.00);

		c1.calculoDeValorComDesconto();
		m1.calculoDeValorComDesconto();
		b1.calculoDeValorComDesconto();

		Veiculo.getTotal();

		Veiculo c2 = new Carro();

		Carro meuSegundoCarro = (Carro) c2;

		System.out.println(meuSegundoCarro.isMotorLigado());
		meuSegundoCarro.ligar();
		System.out.println(meuSegundoCarro.isMotorLigado());

		VolumeDeVendas volumeDeVendas = new VolumeDeVendas();
		volumeDeVendas.registra(c1, false);
		volumeDeVendas.registra(m1, true);
		volumeDeVendas.registra(b1, false);

		System.out.println("O volume de vendas e: " + volumeDeVendas.getSoma());
		
		c1.setVelocidadeMaxima(150);
		m1.setVelocidadeMaxima(100);
		b1.setVelocidadeMaxima(50);
		
		OficinaAutomotiva oficinaAutomotiva = new OficinaAutomotiva();
		
		System.out.println("A velocidade maximo de c1 e: " + c1.getVelocidadeMaxima());
		oficinaAutomotiva.remapDoMotor(c1);
		System.out.println("A velocidade maximo de c1 e: " + c1.getVelocidadeMaxima());

		oficinaAutomotiva.remapDoMotor(m1);
		
		
//		oficinaAutomotiva.remapDoMotor(b1);
		
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		calculadoraDeImposto.calculo(c1);
		
		Triciclo triciclo = new Triciclo();
		triciclo.setPreco(100.00);
		
		calculadoraDeImposto.calculo(triciclo);
		
		System.out.println("O valor total de imposto e : " + calculadoraDeImposto.getImposto());



	}

}
