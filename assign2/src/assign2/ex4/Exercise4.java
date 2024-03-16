package assign2.ex4;

public class Exercise4 {
	public static void main(String[] args) {
		Dictionary<Tuple> dictionary = new Dictionary<Tuple>();		
		Tuple nike = new Tuple("'Nike'", 450, 25);
		Tuple adidas = new Tuple("'Adidas'", 400, 10);
		Tuple puma = new Tuple("'Puma'", 600, 30);
		Tuple sorel = new Tuple("'Sorel'", 360, 0);
		Tuple aldo = new Tuple("'Aldo'", 680, 15);
		Tuple skechers = new Tuple("'Skechers'", 380, 0);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(nike);
		cart.addToCart(adidas);
		cart.addToCart(puma);
		cart.addToCart(sorel);
		cart.addToCart(aldo);
		cart.addToCart(skechers);
		
		// Compare prev and next shoe prices
		while(!dictionary.isEmpty()) {
			Tuple currentItem = null;
		
			for(int i = 0; i < dictionary.getSize(); i++) {
				currentItem = dictionary.getItem(i);
			}
			
			int prev = cart.calculatePrice(currentItem);
			cart.addToCart(currentItem);
			dictionary.removeEntry(currentItem);
		}
		
		System.out.print("Shoes Info: ");
		cart.print();
	}
}
