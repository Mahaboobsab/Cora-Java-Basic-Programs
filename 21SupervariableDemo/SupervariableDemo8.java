class A
{
	int x;
	void m1()
	{
		System.out.println("Inside m1of A");
		System.out.println("value of x is in class A "+x);
	}
}
class B extends A   //Here I am using class A without defining it this is called inheritance
{
int x;
	void fun(int p,int q)
	{
		x=p;
		super.x=q;
		}
		
		
	void m2()
	{
		System.out.println("Inside m2 of A");
		System.out.println("value of x is "+x);
		System.out.println("value of x in super class is "+super.x);
	}
}

class SupervariableDemo8
{
	public static void main(String args[])
	{
		
		B b1=null;
		b1=new B();
		b1.x=6;
		
		System.out.println("value of b1 is "+b1);
		System.out.println("value of x in b1 is "+b1.x);
		
		b1.m1();
		b1.m2();
		b1.fun(7,8);
		b1.m1();
		b1.m2();
		System.out.println("End main");
	
		}
	
}



