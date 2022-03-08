package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String temp = "";
		double total , paid, change = 0.0;

		System.out.print("Total cost of the bill: ");
		temp = input.nextLine();
		total = Double.parseDouble(temp);
		System.out.print("The bill is: "+total + " How much was tendered: ");
		temp = input.nextLine();
		paid = Double.parseDouble(temp);
		change = paid - total;
		System.out.println("The bill is: "+ total + " How much was tendered: " + paid + " Your change is: " + change);
	}

}
