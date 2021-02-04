package ecommerce;
/*
 * Author: Michelle Psaras
 * Class:  Product has name, price, category, quantity, size, author, and color as attributes that are private.
 * Methods:
 * Overrides the toString() Method that returns a String and takes no arguments
 * Buy() Method that returns a Boolean and takes no arguments
 */
public class Product {
	
	private String name;
	private double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color;
	
	//Overloading Constructors
	
	public Product(String name, double price, String category, int quantity, char size, String author, String color) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.size = size;
		this.author = author;
		this.color = color;
	}

	public Product(String name, double price, String category, int quantity, String author) {		
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.author = author;
	}

	public Product(String name, double price, String category, int quantity) {	
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	public Product(String name, double price, String category, int quantity, char size, String color) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}
	//Since attributes are declared as private, need getter and setters to access the attributes outside of the class.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//Overrides the toString method in Object
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
				+ ", size=" + size + ", author=" + author + ", color=" + color + "]";
	}
	/*A buy method that keeps track of the inventory when purchases are made and does not allow a purchase
	 * when there is no quantity left to be purchase, by returning false to the instantiating object.
	 */
	
	boolean buy() {
		if (this.quantity > 0) {
			this.quantity -= 1;
			return true;
		}
		else
			return false;
					
	}
	
	
}
