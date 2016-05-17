class A
{
	int x;
	void m1()
	{
		System.out.println("Inside m1of A");
		System.out.println("value of x is "+x);
	}
}
class B extends A   //Here I am using class A without defining it this is called inheritance
{
int x;
	void m2()
	{
		System.out.println("Inside m2 of A");
		System.out.println("value of x is "+x);
		System.out.println("value of x in super class is "+super.x);
	}
}

class SupervariableDemo6
{
	public static void main(String args[])
	{
		
		B b1=null;
		b1=new B();
		b1.x=5;
		b1.x=6;
		//super.x=7;error
		//b1.super.x=6;Errror

		
		System.out.println("value of b1 is "+b1);
		System.out.println("value of x in b1 is "+b1.x);
		System.out.println("value of x in b1 is "+b1.x);
		b1.m1();
		b1.m2();
		System.out.println("End main");
	
		}
	
}



