package earth;

public class TestaCategoria {

	public static void main(String[] args) {
		
		Men presidente = new Men("Barak", Tamanho.G);
		Xmen wolverine = new Xmen("Wolverine", Tamanho.G, Categoria.DOIS);
		System.out.println("Categoria de "+wolverine.nome+" = "+wolverine.categoria());
		
		Xmen magnetto = new Xmen("Magnetto", Tamanho.M, Categoria.TRES);
		System.out.println("Categoria de "+magnetto.nome+" = "+magnetto.categoria());
		
		Xmen xavier = new Xmen("Professor Xavier", Tamanho.M, Categoria.TRES);
		System.out.println("Categoria de "+xavier.nome+" = "+xavier.categoria());
		
		if(wolverine.vence(magnetto)) System.out.println(wolverine.nome+" vence "+magnetto.nome);
		else System.out.println(wolverine.nome+" não vence "+magnetto.nome);
		
		if(magnetto.vence(wolverine)) System.out.println(magnetto.nome+" vence "+wolverine.nome);
		else System.out.println(magnetto.nome+" não vence "+wolverine.nome);
		
		if(magnetto.vence(xavier)) System.out.println(magnetto.nome+" vence "+xavier.nome);
		else System.out.println(magnetto.nome+" não vence "+xavier.nome);
		
	}

}
