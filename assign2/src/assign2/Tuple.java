package assign2;

public class Tuple {
	private String name = "";
	private int price = 0;
	private int discount =0;
	
	public Tuple(String name, int price, int discount) {
		this.setName(name);
		this.setPrice(price);
		this.setDiscount(discount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
