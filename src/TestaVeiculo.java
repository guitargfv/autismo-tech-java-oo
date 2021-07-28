
public class TestaVeiculo {

	public static void main(String[] args) {
		Veiculo meuPrimeiroVeiculo = new Veiculo();
		meuPrimeiroVeiculo.setCor("Preto");
		System.out.println("A cor do meu veiculo é: " + meuPrimeiroVeiculo.getCor());
		meuPrimeiroVeiculo.setMarca("Fiat");
		meuPrimeiroVeiculo.setPreco(50000.00);
		System.out.println("A marca do meu veiculo é: " + meuPrimeiroVeiculo.getMarca());
		System.out.println("O Valor do meu veiculo é: " + meuPrimeiroVeiculo.getPreco());
		meuPrimeiroVeiculo.setCor("Branco");
		System.out.println("A nova cor do meu veiculo é: " + meuPrimeiroVeiculo.getCor());
		meuPrimeiroVeiculo.acelerar(100);
		System.out.println("O meu carro está a " + meuPrimeiroVeiculo.getVelocidade() + " km/h");
		meuPrimeiroVeiculo.acelerar(10);
		System.out.println("O meu carro agora está a " + meuPrimeiroVeiculo.getVelocidade() + " km/h");
		meuPrimeiroVeiculo.calculoDeValorComDesconto();

		Veiculo meuSegundoVeiculo = new Veiculo();
		meuSegundoVeiculo.setCor("Amarelo");
		System.out.println("A cor do meu primeiro veiculo é: " + meuPrimeiroVeiculo.getCor());
		meuPrimeiroVeiculo.copiaCor(meuSegundoVeiculo);
		System.out.println("A cor do meu primeiro veiculo agora é: " + meuPrimeiroVeiculo.getCor());

//		Referências nulas

		System.out.println("O dono do veiculo é: " + meuPrimeiroVeiculo.getDono());

		Pessoa donoDoVeiculo = new Pessoa("Gabriel", "Felix", 28, "Rua das coves - 31");
		donoDoVeiculo.setNome("Ian");
		meuPrimeiroVeiculo.setDono(donoDoVeiculo);
		System.out.println("O dono do veiculo é: " + meuPrimeiroVeiculo.getDono().getNome());
		meuPrimeiroVeiculo.getDono().setIdade(16);
		System.out.println("O dono do veiculo é: " + meuPrimeiroVeiculo.getDono().getIdade());
		System.out.println("O dono do veiculo é: " + donoDoVeiculo.getIdade());
		System.out.println("O dono do veiculo é: " + donoDoVeiculo);
		System.out.println("O dono do veiculo é: " + meuPrimeiroVeiculo.getDono());
		System.out.println("O nome do dono do veiculo é: " + meuPrimeiroVeiculo.getNomeDoDono());

//		Construtor

		Pessoa pessoa = new Pessoa("Ian", "Felix", 16, "Rua da cocada");
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("Sobrenome da pessoa: " + pessoa.getSobreNome());
		System.out.println("Idade da pessoa: " + pessoa.getIdade());
		System.out.println("Endereco da pessoa: " + pessoa.getEndereco());

		pessoa.setMundo("Terra");
		System.out.println(pessoa.getMundo());
		System.out.println(donoDoVeiculo.getMundo());
		Pessoa.envelhecer(pessoa);
		System.out.println(pessoa.getIdade());

		Veiculo meuTerceiroVeiculo = new Veiculo();

		System.out.println("O total de veiculos criados é: " + Veiculo.getTotal());
		System.out.println("O total de veiculos criados é: " + meuTerceiroVeiculo.getTotal());

	}

}
