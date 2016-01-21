
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
	
 
	@Override
	public String toString(){
		return new StringBuilder("{id: ")
						.append(getId())
						.append(", name: ")
						.append(getName())
						.append(", price: ")
						.append(getPrice())
						.append("}")
						.toString();
		
		
		
	}
	
	@Override
	public boolean equals(Object obj){
		return this.getId() == ((Product)obj).getId() &&
				this.getName().equals(((Product)obj).getName());
		
	}
	
}
