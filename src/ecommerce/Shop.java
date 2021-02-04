/*
 * Author:  Michelle Psaras
 * Class:   Shop 
 * Initializes a Product array with 5 Product Objects.  Asks the user to input a number from 0 to 4 for the product number they
 * would like to purchase.  For every valid number they input the total amount they spend is tallied and the product's 
 * quantity is decremented by one by calling the Object class Product buy() method as long as the quantity is greater than zero. 
 * If the user enters an invalid number the program ends and a message is displayed.
 * If the user enters anything other than an integer, then it causes an exception error which is handled in an exception block which then ends
 * the program.
 */
package ecommerce;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Shop {

	public static void main(String[] args) {
		//Initialize Variables
		double totalAmount = 0.0;
		int userInput = 9;	
		
		//Declaring an array of Product and allocating memory for 5 Products
		Product[] inventory = new Product[5];	
		
		//Initialize the first element of the array
		inventory[0] = new Product("Business Ritual Women'''s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue");
		
		//Initialize the second element of the array
		inventory[1] = new Product("The Art of computer Programming", 190.54, "Books", 9, "Donald E Knuth");
		
		//Initialize the third element of the array		
		inventory[2] = new Product("Men'''s Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
		
		//Initialize the fourth element of the array
		inventory[3] = new Product("Organic Tumeric Soap", 11.25, "Bath & Beauty", 1);
		
		//Initialize the fifth element of the array
		inventory[4] = new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman");
		
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
					if (userInput >= 0 && userInput <= 4) { 
						if (inventory[userInput].buy()) {
							System.out.println("Your purchase was successful");	
							totalAmount += inventory[userInput].getPrice();							
						}
						else {
							System.out.println("Sorry! This product is out of stock");
						}
					}
					else {
						System.out.println("Thank you for shopping with us!  The total amount is " + totalAmount);
						break;	
					}
				}
				catch (InputMismatchException e) {
					System.out.println("Invalid input, exiting the Shopping Cart.  Your total amount is " + totalAmount);
					break;
				}
							
				
				}		
		//Close the scanner file
		sc.close();		
		}						
		
	}
	

