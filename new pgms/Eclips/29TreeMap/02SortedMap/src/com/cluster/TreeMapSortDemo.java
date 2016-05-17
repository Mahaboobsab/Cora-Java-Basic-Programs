package com.cluster;

import java.util.TreeMap;

public class TreeMapSortDemo {

	public static void main(String[] args) {
		// Create a TreeMap to sort in natural order
				TreeMap customerMap1 = new TreeMap();
				customerMap1.put("Kumar", new Double(11.11));
				customerMap1.put("Ravi", new Double(22.22));
				customerMap1.put("Amogh", new Double(33.33));
				customerMap1.put("Vinay", new Double(44.44));
				customerMap1.put("Balaji", new Double(55.55));

				System.out.println(customerMap1);
				
				TreeMap customermap2 = new TreeMap(new MyComparator());
				
				customermap2.put("Kumar", new Double(11.11));
				customermap2.put("Ravi", new Double(22.22));
				customermap2.put("Amogh", new Double(33.33));
				customermap2.put("Vinay", new Double(44.44));
				customermap2.put("Balaji", new Double(55.55));

				System.out.println(customermap2);
				
	}

}
