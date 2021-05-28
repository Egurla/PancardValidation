package com.regexvalidation;

import java.util.Scanner;

public class PancardValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Panid: ");
		
		String str = sc.next();
		String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
		
		boolean result = str.matches(regex);
		if(result) {
		System.out.println("Given PanId is valid");
		} else {
		System.out.println(str+" is not valid PAN number");
		}
		
		
	}

}
