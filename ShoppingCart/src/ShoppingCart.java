
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
				total += product.price;
				}
		
	}
	
	public void removeProduct(int id)
	{
		if(finish) return;
		for (int i = 0; i < products.length; i++) {
			if(products[i].id == id){
				total -= products[i].price;
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
			System.out.println(products[i].id);
			
		}
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
