class A
{
	int x;
	void m1()
	{
		System.out.println("Inside m1of A");
		System.out.println("value of x is "+x);
	}
}
class B extends A
{
int y;
	void m2()
	{
		System.out.println("value of x ix "+x);
	}
}

class SupervariableDemo
{
	public static void main(String args[])
	{
		A a1=null;
		a1=new A();
		a1.x=10;
		
		System.out.println("value of a1 is "+a1);
		System.out.println("value of x in a1 is "+a1.x);
		a1.m1();
	
		}
	
}



