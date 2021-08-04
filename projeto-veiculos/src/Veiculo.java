
public abstract class Veiculo {
	private String marca;
	private Double preco;
	private String cor;
	private int velocidade;
	private String corDasRodas;
	private Pessoa dono;
	private int velocidadeMaxima;
	private static int total = 0;

	public Veiculo() {
		Veiculo.total++;
	}

	public Veiculo(String marca, Double preco, String cor, String corDasRodas, int velocidadeMaxima) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
		this.corDasRodas = corDasRodas;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
		total++;
	}
	

	public Veiculo(String marca, Double preco, String cor, String corDasRodas, Pessoa dono, int velocidadeMaxima) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
		this.corDasRodas = corDasRodas;
		this.dono = dono;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
		total++;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Veiculo.total = total;
	}

	public void acelerar(int velocidade) {
		if (velocidade > 0) {
			int novaVelocidade = this.velocidade + velocidade;
			if (novaVelocidade <= velocidadeMaxima) {
				this.velocidade = novaVelocidade;
			} else {
				System.out.println("Velocidade maxima alcançada");
			}
		} else {
			System.out.println("Passe uma velocidade positiva");
		}
	}

	public abstract Double calculoDeValorComDesconto();

	public void pinturaCompleta(String corDoCarro, String corDasRodas) {
		this.cor = corDoCarro;
		this.corDasRodas = corDasRodas;
	}

	public void copiaCor(Veiculo veiculo) {
		this.cor = veiculo.cor;
		this.corDasRodas = veiculo.corDasRodas;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("O preço do veiculo não pode ser negativo, por favor passe outro valor");
		}
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public String getCorDasRodas() {
		return corDasRodas;
	}

	public void setCorDasRodas(String corDasRodas) {
		this.corDasRodas = corDasRodas;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
