
public class Veiculo {
	private String cor;
	private Double preco;
	private String marca;
	private int velocidade;
	private Pessoa dono;

	public void acelerar(int velocidade) {
		this.velocidade = this.velocidade + velocidade;
	}

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
	
	

}
