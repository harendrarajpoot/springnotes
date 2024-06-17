package com.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDigitFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Radhey Radhey...");
		
		
// 1 way we can create list of inter number using Arrays.asList method 		
	List<Integer> myList=Arrays.asList(1,8,2123,789,322,714);
	
	// 2 way we can create list of inter number using create arraylist object and inser data using add method.
	
	List<Integer> al=new ArrayList<Integer>();
	al.add(13);
	al.add(82);
	al.add(2123);
	al.add(789);
	al.add(322);
	al.add(714);
	
	
	
	
	
	
	//System.out.println(al);

	//System.out.println(myList);
	//  v2123
	for (int  value :myList) {
		//1 8 2123 789 322 714
		
		

		String val=Integer.toString(value);
		if (val.length()==1) {
			continue;
		}
		
		else{
			int secondDigit= Integer.parseInt((Integer.toString(value).substring(1, 2)));// convert integer number to string ex: "2123","789"
			
		
		if(secondDigit==1)
		{
			System.out.println(value);// 2123 ,714
		}
		}
		
		
		
		
		
	}

	
	}

}
