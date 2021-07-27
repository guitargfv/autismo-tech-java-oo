
public class Pessoa {
	private String nome;
	private String sobreNome;
	private int idade;
	private String endereco;
	private static String mundo;

	public Pessoa() {

	}

//
//	public Pessoa(String nome, String sobreNome, String endereco) {
//		this.nome = nome;
//		this.sobreNome = sobreNome;
//		this.endereco = endereco;
//	}
//
	public Pessoa(String nome, String sobreNome, int idade, String endereco) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static String getMundo() {
		return mundo;
	}

	public static void setMundo(String mundo) {
		Pessoa.mundo = mundo;
	}

	public static void envelhecer(Pessoa pessoa) {
		pessoa.setIdade(pessoa.getIdade() + 1);
	}

}
