package com.spring;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Radhey Radhey...");
		
		String str="aaaavvvbbbbb";// 
		
		// a=4 true bcoz even
		// v=3  flase bcz odd 
		// b=5 flae bcoz odd
		
	
		
		Map<Character, Integer> map=new HashMap<>();// 
		
	
		for (int i = 0; i < str.length(); i++) {// 8
			
			char key=str.charAt(i);// 'a' ,'v' 'b'
			
			if(map.containsKey(key))
			{
				map.put(key, map.get(key)+1);//a=4 ,v=3 b=5
			}
			else
			{
				map.put(key, 1);// a=1, v=1, b=1
			}
		}
		
		
		for(Map.Entry<Character,Integer> m: map.entrySet())
		{
			if(m.getValue()%2==0)
			{
				System.out.println(m.getKey() +" true");
			}
			else
			{
				System.out.println(m.getKey()+" False");
			}
			
		}
		
		
		
		
	}

}
