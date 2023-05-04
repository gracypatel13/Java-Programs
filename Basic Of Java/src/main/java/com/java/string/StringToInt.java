package com.java.string;

import java.util.Optional;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//using valueOf(String) method of Integer class it returns integer object
	public void withValueOf(String string) {
		try {
		int number=Integer.valueOf(string);
		System.out.println("String was "+string+"  Number is "+number);
		}
		catch(NumberFormatException ex) {
			ex.getMessage();
		}
	}
	
	//using parseInt(String) method of Integer class it return int
	public void withParseInt(String string) {
		int number=Integer.parseInt(string);
		System.out.println("String was "+string+"  Number is "+number);

	}
	
	//with optional<Integer> in java 8
	public Optional<Integer> stringToInt(String string){
		string=string.trim();
		if(string.isEmpty())
			return Optional.empty();
		
		try {
			return Optional.of(Integer.valueOf(string));
		}
		catch(NumberFormatException ex) {
			return Optional.empty();
		}
		
	}

}
