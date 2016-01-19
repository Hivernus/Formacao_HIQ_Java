
public class ShoppingCart {
/*
 * Attributes
 */
	
	private float total;
	private boolean finish;
	private Customer customer; //referência para a class Customer
	private Product[] products;
	private int cartSize;
	
	//colocar antes do tipo da váriavel:
	//	public - visivel de todo o lado
	//	private - visivel dentro da classe
	//  default.package - visivel dentro do package
	//  protected
	//	ex: private float total;
	
	
	/*
	 * Actions
	 */
	
	public void addProduct(Product product)
	{
		//total = total + product.price;
		//total += product.price;
		//for (int i = 0; i < products.length; i++) 
		//{
			
			//if(products[i] != null)
			//	continue;
			//products[i] = product;
			
			//if(products[i] == null)
			//{
			//	products[i] = product;
			//	total += product.price;
			//	break;
		//	}
		
		//}
		
			if(!finish && cartSize < products.length)
				{
				products[cartSize++] = product;
				total += product.getPrice();
				}
		
	}
	
	public void removeProduct(int id)
	{
		if(finish) return;
		for (int i = 0; i < products.length; i++) {
			if(products[i].getId() == id){
				total -= products[i].getPrice();
				products[i] = products[--cartSize];
				products[cartSize] = null;
				break;
 				
			}
		}
	}
	
	public boolean isFinished()
	{
		return finish;
	}
	
	public void finish() {
		finish = true;
	}
	
	public void printProducts(){
		for (int i = 0; i < products.length; i++) {
			
			if (products[i] != null)			
			System.out.println(products[i].getId());
			
		}
	}
	
	//para gerar getters e setters devemos fazer: right mouse click -> source -> Generate Getters and Setters
	
	public boolean isFinish() {
		return finish;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Product[] getProducts() {
		return products;
	}

	public int getCartSize() {
		return cartSize;
	}

	public void setCustomer(Customer customer){
		this.customer = customer; 
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setProducts(int size){
		products = new Product[size];
	}
	
	
	
}
