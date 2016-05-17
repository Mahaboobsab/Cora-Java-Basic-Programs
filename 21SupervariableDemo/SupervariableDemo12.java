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
	void fun(int x)
	{
		System.out.println("value of x in Beforrrrrrrr super class is "+super.x);
		super.x=x;
		this.x=x;
		System.out.println("Inside fun++++++++++++++++++++++++++++++++++++ of B");
		System.out.println("value of x is "+x);
		System.out.println("value of x in super class is "+super.x);
		
		}
}

class SupervariableDemo12
{
	public static void main(String args[])
	{
		
		B b = new B();
		b.fun(5);
		b.m1();
		
		}
	
}



