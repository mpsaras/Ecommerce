/*
 * Author:  Michelle Psaras
 * Class:   Shop 
 * Initializes a Product array with 5 Product Objects.  Asks the user to input a number from 0 to 4 for the product number they
 * would like to purchase.  For every valid number they input the total amount they spend is tallied and the product's 
 * quantity is decremented by one by calling the Object class Product buy() method as long as the quantity is greater than zero. 
 * If the user enters an invalid number, then it causes an exception error which is handled in a catch block and the program ends and a message is displayed.
 * If the user enters anything other than an integer, then it causes an exception error which is handled in a catch block and a message is displayed.
 * the program.
 */
package ecommerce;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Shop {
	
	//Initialize Variables
	
	static boolean isShopOpen = true;
	static double totalAmount = 0.0;
	static int userInput = 9;
	
	//Declaring an array of Product and initialization in one statement
	
	static Product[] inventory = {new Product ("Business Ritual Women'''s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue"), new Product("The Art of computer Programming", 190.54, "Books", 9, "Donald E Knuth"),
	new Product("Men'''s Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"), new Product("Organic Tumeric Soap", 11.25, "Bath & Beauty", 1), new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman")};	
	
	public static void main(String[] args) {		
		
		
		if (!isShopOpen) {
			System.out.println("Sorry shop is not open please come back between the hours of 9:00 a.m. to 5:00 p.m");
		}
		else {
						
			//Create a Scanner object
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				System.out.println("Enter the product index (0 to 4) you want to buy.  To Exit the shopping cart, enter"
						+ " any number other than 0 to 4");
				
					for (int i = 0; i < inventory.length; i++) {
						System.out.println(i + ":" + inventory[i].getName());
						
					}
					try {
						userInput = sc.nextInt(); 
							if (inventory[userInput].buy()) {
								System.out.println("Your purchase was successful");	
								totalAmount += inventory[userInput].getPrice();							
							}
							else {
								System.out.println("Sorry! This product is out of stock");
							}
							
						}
		
					catch (InputMismatchException e) {
						System.out.println("Invalid input, exiting the Shopping Cart.  Your total amount is " + totalAmount);
						break;
						
					} 
					catch (ArrayIndexOutOfBoundsException e) {			
						System.out.println("Thank you for shopping with us!  The total amount is " + totalAmount);
						break;	
					}		
				
			}
			//Close the scanner file
			sc.close();	
		}	
		
	}	
	
}
