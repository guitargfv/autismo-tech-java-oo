package mars;

public class Mutation {
	public String description;
	public int strengh;
	
	public Mutation(String description, int strengh) {
		this.description = description;
		this.strengh = strengh;
	}
	
	public int getStrengh() {
		return this.strengh;
	}
}
