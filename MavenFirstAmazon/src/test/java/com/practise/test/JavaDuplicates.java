package com.practise.test;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class JavaDuplicates 
{	
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();	
		System.out.println(str);
		
		String [] st = str.split(" ");
		HashMap<String , Integer> hm = new HashMap<String , Integer>();
		for(String s : st)
		{
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
				
		}
		System.out.println("The string is from Hash Map "+hm);
	
	for(Entry<String , Integer>e : hm.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("The value is :"+e.getKey()+"   \t   "+e.getValue());
			}
		}
	}
}
