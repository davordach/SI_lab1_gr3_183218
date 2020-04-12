import java.util.ArrayList;

class Item {
	int id;
	String name;
	double price;
	int texType;

	//TODO constructor

	public Item(int id, String name, double price, int texType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.texType = texType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getTexType() {
		return texType;
	}
//TODO setters and getters

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTexType(int texType) {
		this.texType = texType;
	}

	double taxReturn () {
		return price *0.15;
	}
}

class Receipt {

	List<Item> itemList;

	public Receipt() {
	itemList= new ArrayList<Item>();
	}
}