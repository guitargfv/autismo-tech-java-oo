package mars;

import earth.Categoria;
import earth.Men;
import earth.Tamanho;

public class Xmen extends Men implements Mutations{
	
	public Xmen(String nome, Tamanho tamanho, Mutation mutation) {
		super(nome, tamanho);
		mutations.add(mutation);
	}

	public Xmen(String nome, Tamanho tamanho) {
		super(nome, tamanho);
	}
	
	public int allStrengh() {
		int strengh = 0;
		for(Mutation mutation : mutations) {
			strengh+=mutation.getStrengh();
		}
		return strengh;
	}
	
	public boolean vence(Xmen oponente) {
		return this.allStrengh()>oponente.allStrengh();
	}
}
