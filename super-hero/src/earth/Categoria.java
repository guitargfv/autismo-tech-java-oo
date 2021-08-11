package earth;

public enum Categoria {
	UM(1),
	DOIS(2),
	TRES(3);
	
	public final int numero;
	
	private Categoria(int numero) {
		this.numero = numero;
	}
	
	public static int numero() {
		return Categoria.numero();
	}
}
