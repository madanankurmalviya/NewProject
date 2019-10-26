package com.practise.test;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
public class compareTwo
{
	public static void main(String[]args)
	{
		String st = "Hello my name is ankur a Hello my name is in in in in in in ni om Hello my area is in india";
		String [] str = st.split(" ");
		HashMap <Integer , String > hm = new HashMap<Integer , String >();
		for (String s : str)
		{
			
			hm.put(s.length(),s);
		}
		System.out.println(hm);
		LinkedList<Entry<Integer , String>>list = new LinkedList<Entry<Integer,String>>(hm.entrySet());
		{
			Collections.sort(list,new Comparator<Entry<Integer,String>>()
					{
						public int compare(Entry<Integer,String>a1 , Entry<Integer,String>a2)
						{
							return a1.getValue().compareTo(a2.getValue());
						}
					});
		}
		System.out.println(list);
	}

}
