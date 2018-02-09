package com.full.hashsetcoll;

import java.util.HashSet;
import java.util.Scanner;
class bookSet
{
	int id;
	String name;
	bookSet(int id,String name)
	{
		System.out.println(id+" "+name);
	}
}

public class setExample {
	HashSet <bookSet> s=new HashSet<bookSet>();
	public static void main(String args[])
	{
		int id ;
		Scanner sc =new Scanner(System.in);
		String name;
		id = sc.nextInt();
		name = sc.nextLine();
		bookSet b = new bookSet(id,name);
		
		
		
		
		
	

		}

}
