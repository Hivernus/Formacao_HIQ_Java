
public class Store {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.name = "Edgar";
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Batatas");
		p1.setPrice(2.3F); //coloca-se sempre um F no final de uma variável do tipo float, caso contrário é um double
		
		System.out.println(p1);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Couves");
		p2.setPrice(0.6F);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Cenouras");
		p3.setPrice(1.4F);
		
		
		ShoppingCart shoppingCart = new ShoppingCart();
		//shoppingCart.customer = customer;
		shoppingCart.setCustomer(customer);
		//shoppingCart.products = new Product[10];
		shoppingCart.setProducts(10);
		
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);
		
		System.out.println("Total:" + shoppingCart.getTotal());
		
		//shoppingCart.customer.name = "Ricardo" //Neste caso tenho duas referências para o mesmo objecto. Ao alterar a String aqui, altero no customer.name
		//System.out.println("Customer's Name:" + customer.name);
		//System.out.println("SC Customer's Name:" + shoppingCart.customer.name);
		System.out.println("SC Customer's Name:" + shoppingCart.getCustomer().name);
		
		//shoppingCart.removeProduct(p2.id);
			
		shoppingCart.printProducts();
		
		System.out.println("[B]isFinished?:" + shoppingCart.isFinished());
		shoppingCart.finish();
		System.out.println("[A]isFinished?:" + shoppingCart.isFinished());
		
	}
	

}