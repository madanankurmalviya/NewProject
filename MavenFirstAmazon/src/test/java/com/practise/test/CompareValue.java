package com.practise.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class CompareValue
{
	public static void main(String[]args)
	{
		String str = "I am a boy I am a man scjdc sdlcnlsdnclds lsdknclksdnclksdnc dkdkdkdk jkdjdj djdjdj ddkdk kdkd kdk kdkd kdk kdk Hello Hello Hello";
		String [] st = str.split(" ");
		HashMap <String , Integer> hm = new HashMap<String , Integer>();
		for(String s : st)
		{
			hm.put(s,s.length());
		}
		LinkedList<Entry<String,Integer>> list = new LinkedList<Entry<String, Integer>>(hm.entrySet());
		{
			Collections.sort(list,new Comparator<Entry<String,Integer>>()
					{
						public int compare(Entry<String,Integer>a1 , Entry<String,Integer>a2)
						{
							return a1.getValue().compareTo(a2.getValue());
						}			
					});
			System.out.println(list);
		}
		
	}
}
