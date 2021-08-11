package mars;

import java.util.List;

import earth.Tamanho;

public class ArmaXI extends Xmen{

	public ArmaXI(String nome, Tamanho tamanho, List<Mutation> mutacoes) {
		super(nome, tamanho);
		for(Mutation mutation : mutacoes) {
			mutations.add(mutation);
		}

	}
}
