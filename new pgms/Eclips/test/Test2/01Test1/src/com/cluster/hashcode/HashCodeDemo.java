package com.cluster.hashcode;

public class HashCodeDemo {

	public static void main(String[] args) {

		/*String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println("Hashcode of string s1 is : " + s1.hashCode());
		System.out.println("HashCode of String s2 is : " + s2.hashCode());

		boolean b = s1.equals(s2);
		System.out.println("Both s1&s2 Strings aRe equal : " + b);
		
	boolean b1=	s1==s2;
	System.out.println("If both s1 and s2 are refering to saame object : "+b1);
	
	
	
	Integer x= new Integer(10);
	Integer y = new Integer(10);
	System.out.println("Hashcode of Integer x is : " + x.hashCode());
	System.out.println("HashCode of Integer y  is : " + y.hashCode());
	
	
	boolean b3=x.equals(y);
	System.out.println("Both x & y Are  equal : " + b3);
	
	
	boolean b4=x==y;
	System.out.println("Both x & y Are  refering to same object : " + b4);
	*/
	
		
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(101);
		employee1.setName("AAA");
		employee1.setPhone("1111");
		employee1.setEmail("AA@CLUSTERINDIA.COM");
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(102);
		employee2.setName("BBB");
		employee2.setPhone("2222");
		employee2.setEmail("BB@CLUSTERINDIA.COM");
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(101);
		employee3.setName("AAA");
		employee3.setPhone("1111");
		employee3.setEmail("AA@CLUSTERINDIA.COM");
		
		System.out.println("hash code of emp1 is " + employee1.hashCode());
		System.out.println("hash code of emp3 is " + employee3.hashCode());
		
		boolean b1 = employee1.equals(employee3);
		System.out.println("Both employees are equal: " + b1);
		
		boolean b2 = employee1 == employee3;
		System.out.println("Both emp1 & emp2 refer to same object: " + b2);
	}

}
