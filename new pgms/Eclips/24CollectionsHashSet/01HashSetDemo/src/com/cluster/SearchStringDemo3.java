package com.cluster;

import java.util.HashSet;

public class SearchStringDemo3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Meheboob");
		set.add("Sabiya");
		set.add("Bismilla");
		set.add("Sayyadabayya");
		set.add("Nabibayya");
		set.add("Jannat");
		
		System.out.println("Elments in Hash Set are : "+set);
		
		boolean b =set.contains("Meheboob");
		System.out.println("Meheboob is present ? : "+b);
		
		
		if (set.contains("Dad"))
		{
			System.out.println("Dad is present ");
		}
		else
		{
			System.out.println("Dad is Absent ");
		}

	}

}
