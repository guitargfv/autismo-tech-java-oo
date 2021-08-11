package earth;

public class Xmen extends Men {
	private Categoria categoria;
	
	public Xmen(String nome, Tamanho tamanho, Categoria categoria) {
		super(nome, tamanho);
		this.categoria = categoria;
	}

	public int categoria() {
		return this.categoria.numero;
	}
	
	public boolean vence(Xmen oponente) {
		return this.categoria()>oponente.categoria();
	}
}
