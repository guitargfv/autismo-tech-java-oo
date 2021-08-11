package earth;

public class Men {
	protected Tamanho tamanho;
	public String getNome() {
		return nome;
	}

	protected String nome;
	
	public Men(String nome, Tamanho tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public void andar() {
		System.out.println("Caminhando");
	}
	
	public boolean comer(String alimento) {
		return true;
	}
	
	public boolean beber(String bebida) {
		return true;
	}
}
