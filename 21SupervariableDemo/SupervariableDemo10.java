class A
{
	int x;
	
}
class B extends A  
{
	int x=5;	
	void m1()
	{
		System.out.println("Inside m1 of B");
		System.out.println("value of x is "+x);
		System.out.println("value of x in super class is "+super.x);
	}
}

class SupervariableDemo10
{
	public static void main(String args[])
	{
		
		B b = new B();
		b.x=1;
		System.out.println("val of b is "+b);
		System.out.println("val of x in  b is "+b.x);
		b.m1();
		}
	
}



