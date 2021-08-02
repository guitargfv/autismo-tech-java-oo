
// Não pode instanciar objetos dessa classe pois e abstrata
public abstract class Veiculo {
	private String cor;
	protected Double preco;
	private String marca;
	private int velocidade;
	private int velocidadeMaxima;
	private Pessoa dono;
	private static int total = 0;
	
	
	public Veiculo() {
		Veiculo.total++;
	}
	
	public Veiculo(String cor) {
		this.cor = cor;
		Veiculo.total++;
	}

	public void acelerar(int velocidade) {
		this.velocidade = this.velocidade + velocidade;
	}

//	quandor for abstrato sera um metodo sem corpo
	public Double calculoDeValorComDesconto() {
		Double valorComDesconto = this.preco * 0.9;
		System.out.println("O valor do veiculo com desconto padrão é: " + valorComDesconto);
		return valorComDesconto;
	}

	public void copiaCor(Veiculo veiculo) {
		this.cor = veiculo.cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNomeDoDono() {
		return this.dono.getNome();
	}
	
	public static int getTotal() {
		return Veiculo.total;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	

}
