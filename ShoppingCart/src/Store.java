
public class Store {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.name = "Edgar";
		
		Product p1 = new Product();
		p1.id = 1;
		p1.name = "Batatas";
		p1.price = 2.3F; //coloca-se sempre um F no final de uma variável do tipo float, caso contrário é um double
		
		Product p2 = new Product();
		p2.id = 2;
		p2.name = "Couves";
		p2.price = 0.6F;
		
		Product p3 = new Product();
		p3.id = 3;
		p3.name = "Cenouras";
		p3.price = 1.4F;
		
		
		ShoppingCart shoppingCart = new ShoppingCart();
		//shoppingCart.customer = customer;
		shoppingCart.setCustomer(customer);
		//shoppingCart.products = new Product[10];
		shoppingCart.setProducts(10);
		
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);
		
		System.out.println("Total:" + shoppingCart.total);
		
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
