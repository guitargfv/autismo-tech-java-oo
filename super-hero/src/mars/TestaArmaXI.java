package mars;

import java.util.ArrayList;
import java.util.List;

import earth.Tamanho;

public class TestaArmaXI {

	public static void main(String[] args) {
		Mutation regenerate = new Mutation("Capacidade de se auto regenerar", 9);
		Mutation teletransporte = new Mutation("Capacidade de se transportar instantaneamente", 7);
		Mutation laser = new Mutation("Capacidade de dispara raios laser", 8);
		List<Mutation> mutacoes = new ArrayList<>();
		mutacoes.add(regenerate);
		mutacoes.add(teletransporte);
		mutacoes.add(laser);
		
		Xmen wolverine = new Xmen("Wolverine", Tamanho.G, regenerate);
		System.out.println("Força de "+wolverine.getNome()+" = "+wolverine.allStrengh());
		
		ArmaXI armaXI = new ArmaXI("DeadPool", Tamanho.G, mutacoes);
		System.out.println("Força de "+armaXI.getNome()+" = "+armaXI.allStrengh());
		
		if(wolverine.vence(armaXI)) System.out.println(wolverine.getNome()+" vence "+armaXI.getNome());
		else System.out.println(wolverine.getNome()+" não vence "+armaXI.getNome());


	}

}
