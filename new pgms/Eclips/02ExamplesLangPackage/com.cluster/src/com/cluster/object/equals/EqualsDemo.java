package com.cluster.object.equals;

public class EqualsDemo {

	public static void main(String[] args) {
		//program-1
	/*	int p=10;
		int q=20;
		if(p==q)
		{
			System.out.println("They are equal.....");
			
		}
		else
		System.out.println("They are not equal.....");
			*/
		/*Test t1=new Test(10,20);
		Test t2=new Test(10,20);
		Test t3=new Test(5,5);
		if(t1==t2)//check ref val of both objects
		{
			System.out.println("They are Equal....");
			
		}
		else
		System.out.println("They are not Equal....");*/
		
		//program-1 & 2
			
		Test t1=new Test(10,20);
		/*Test t5;
		t5=t1;*/
		Test t2=new Test(10,20);
		Test t3=new Test(5,5);
		if(t2.equals(null))//check ref val of both objects
		{
			System.out.println("They are Equal....");
			
		}
		else
		{
		System.out.println("They are not Equal....");
	}
		}

}
