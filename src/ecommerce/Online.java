///*
// * Author:  Michelle Psaras
// * Class:   Online
// * Initializes a Product arraylist with 5 Product Objects.  Asks the user to input a number from 0 to 4 for the product number they
// * would like to purchase.  For every valid number they input the total amount they spend is tallied and the product's 
// * quantity is decremented by one by calling the Object class Product buy() method as long as the quantity is greater than zero. 
// * If the user enters an invalid number, then it causes an exception error which is handled in a catch block and the program ends and a message is displayed.
// * If the user enters anything other than an integer, then it causes an exception error which is handled in a catch block and a message is displayed.
// * the program.
// */
package ecommerce;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Online {
	
	static ArrayList<Product> items = new ArrayList<Product>();
	static double totalAmount = 0.0;
	static int userInput = 9;

	
	
	public static void main(String[] args) {
		
	items.add(new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"));
	
	items.add(new Book ("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Education", "9788-429-1266-48"));
		
	items.add(new Apparel("Men's Business Casual Shirt",57.10, 2, 'M', "Teal"));
	
	items.add(new Bath("Organic Turmeric Soap", 11.25, 1));
	
	items.add(new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman"));
	
	
	
	//Create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	try {
		
		while (true) {			
		
			System.out.println("Enter the product index (0 to 4) you want to buy.  To Exit the shopping cart, enter"
					+ " any number other than 0 to 4");
			int i = 0;
			for (Product obj: items ) {
				if (obj.getClass() == Book.class) {
					Book book = (Book) obj;					
					if (book.getGenre() != null) 
						System.out.println(i + ":" + book.getName() + " " + book.getPrice() + " " + book.getQuantity() + " " + book.getAuthor() + " " +
								book.getGenre() + " " + book.getIsbn());
					
					else	
						System.out.println(i + ":" + book.getName() + " " + book.getPrice() + " " + book.getQuantity() + " " + book.getAuthor());
						
				}
				else
				if (obj.getClass() == Apparel.class) {
					Apparel apparel = (Apparel) obj; 
					System.out.println(i + ":" + apparel.getName() + " " + apparel.getPrice() + " " + apparel.getQuantity() + " " + apparel.getSize() + " " + 
					apparel.getColor());
					
				}
				else
				if (obj.getClass() == Bath.class) {
					Bath bath = (Bath) obj;
					System.out.println(i + ":" + " " + bath.getName() + " " + bath.getPrice() + " " + bath.getQuantity());
					
				}
				i++;
			}		
			
						
					userInput = sc.nextInt();
					if (items.get(userInput).buy()) {
						System.out.println("Your purchase was successful");	
						totalAmount += items.get(userInput).getPrice();	
						
					}
					else {
						System.out.println("Sorry! This product is out of stock");
						
					}
			}
	}
			

			catch (InputMismatchException e) {
				
				System.out.println("Invalid input, exiting the Shopping Cart.  Your total amount is " + totalAmount);					
				
				
			} 
			catch (IndexOutOfBoundsException e) {
				
				System.out.println("Thank you for shopping with us!  The total amount is " + totalAmount);
					
			}
			finally {
				//Close the scanner file
				
					sc.close();
					
				
			
			}
	

		}
			

	}
	

