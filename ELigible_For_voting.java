package org.thusday13.anudip;

import java.util.Scanner;

public class ELigible_For_voting {
	public static void main(String[] args) {

		System.out.println("Enter the Age to check for eligible of voting or not");
         
		//taking input from user
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
       
		//checking the condition of age
		if (age >= 18) {
			System.out.println("Welcome, you are eligible for vote");
		} else {
			System.out.println("Sorry, you are not eligible for vote ");
		}
	}

}
