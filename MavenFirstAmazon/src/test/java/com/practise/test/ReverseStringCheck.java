package com.practise.test;

public class ReverseStringCheck 
{
	public static void main(String[]args)
	{
		String str = "Hello is si olleH";
		String st = str.replaceAll(" ","");
				//System.out.println(st);
		String rev ="";
		for(int a = st.length()-1;a >=0 ; a --) 
		{
			rev = rev + st.charAt(a);
		}
		if(rev.equals(st))
		{
			System.out.println("Is reversible "+rev);
		}
		else 
		{
			System.out.println("Is non reversible "+rev);
		}
	}
}
