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
int y;
	void m2()
	{
		System.out.println("value of x is "+x);
		
	}
}

class SupervariableDemo1
{
	public static void main(String args[])
	{
		
		B b1=null;
		b1=new B();
		b1.x=5;
		b1.y=6;
		
		System.out.println("value of b1 is "+b1);
		System.out.println("value of x in b1 is "+b1.x);
		System.out.println("value of y in b1 is "+b1.y);
		b1.m1();
		b1.m2();
	
		}
	
}



