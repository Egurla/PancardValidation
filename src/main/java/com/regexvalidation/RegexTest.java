package com.regexvalidation;

public class RegexTest {

	public static void main(String[] args) {
		PancardValidator pancardValidator=new PancardValidator();
		boolean isValid=pancardValidator.isValidPancardNumber("asdfs1235f");
		System.out.println(isValid);
		
	}
}
