package com.practise.test;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class CompareByValue
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Desired String");
		String str = sc.nextLine();
		String[]stt= str.split(" ");
		HashMap<String,Integer> hm = new java.util.HashMap<String, Integer>();
		for(String s :stt)
		{
			hm.put(s,s.length());
		}
		
		LinkedList <Entry<String , Integer>> list = new LinkedList <Entry<String, Integer>>(hm.entrySet());
		{
			System.out.println(list);
			Collections.sort(list,new Comparator<Entry<String,Integer>>()
				
					{
						public int compare(Entry<String,Integer>a1 ,Entry<String,Integer>a2)
						{
							return a1.getValue().compareTo(a2.getValue());
						}
					});
			System.out.println(list);
//			for(Entry<String ,Integer> st : list)
//			{
//				System.out.print(st);
//			}
		}
		
		
	}
	
}
