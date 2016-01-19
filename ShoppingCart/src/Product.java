import sun.org.mozilla.javascript.internal.ast.ForInLoop;
import sun.org.mozilla.javascript.internal.ast.ForLoop;

public class Product {
	
	// classe -> definição de um tipo
	// objecto -> instância de uma classe
	
	// declaração dos atributos da classe
	
	/*
	 * Attributes
	 */
	
	private	int id;
	private String name;
	private float price; //float -> 32 bits e double -> 64 bits
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
 
	
	
}
