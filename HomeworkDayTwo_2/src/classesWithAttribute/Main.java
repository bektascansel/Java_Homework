package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
	
		Product product=new Product(1,"Laptop","Asus laptop",1000,100);
		
		/*product.set_name("laptop");
		product.setId(1);
		product.set_description("Asus laptop");
		product.set_price(110);
		*/

		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		

	}

}
