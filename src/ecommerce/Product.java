package ecommerce;
/*
 * Author: Michelle Psaras
 * Online Shopping Application
 * Class:  Product has name, price, quantity that are protected.
 * Product class is inherited by the Book, Apparel, and Bath classes
 * Methods:
 * Buy() Method that returns a Boolean and takes no arguments
 * Abstract getDetails() method 
 */
abstract class Product {
	
	protected String name;
	protected double price;
	protected int quantity;
	
	
	//Overloading Constructors
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	
	abstract void getDetails();
	
	
}
class Book extends Product {
		private String author;
		private String genre;
		private String isbn;

		
		
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
		}

	
	
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}
	

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	@Override
	void getDetails() {
		System.out.println("We sell books that'll make you smarter at programming");
	}		 
}
	class Apparel extends Product {
		private char size;
		private String color;
		
		public Apparel(String name, double price, int quantity, char size, String color) {
			super(name, price, quantity);
			this.size = size;
			this.color = color;
		}

		public char getSize() {
			return size;
		}

		public void setSize(char size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		void getDetails() {
			System.out.println("We sell different kinds of business clother for both men and women");
		}
		
	}
	class Bath extends Product {	
	
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
	@Override
	void getDetails() {
		System.out.println("We sell organic bath products!");
		}
	}
