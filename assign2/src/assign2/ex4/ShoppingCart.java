package assign2.ex4;

import assign2.Stack;

public class ShoppingCart {
	private Stack<Tuple> cart = new Stack<Tuple>();
	private Tuple prev = null;
	private Tuple next = null;
	
	public void addToCart(Tuple item) {
		cart.push(item);
	}
	
	public void removeFromCart() {
		cart.pop();
	}
	
	public int calculatePrice(Tuple item) {
		int price = item.getPrice();
		int discount = item.getDiscount();
		int newPrice = price - discount;
		return newPrice;
	}

	public void print() {
		if(cart.isEmpty()) {
			System.out.println("Cart is empty");
			throw new NullPointerException();
		}
		
		while(!cart.isEmpty()) {
			Tuple item = cart.pop();
			System.out.print("(" + item.getName() + ", " 
					+ item.getPrice() + ", " 
					+ item.getDiscount() + "), ");
		}
		
	}
}
