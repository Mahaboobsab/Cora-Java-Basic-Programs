class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}

class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2");

	}
}

class C extends A
{
	void m3()
	{
		System.out.println("Inside C m3");

	}
}
class D extends A
{
	void m4()
	{
		System.out.println("Inside D m4");

	}
}

class InstanceOfDemo8
{
	public static void main(String args[])
	{
		A a=new C();//compiles but during runtime it gives an eror
		a.m1();	
	    System.out.println("value of a is "+a);
		B b=(B)a;		
	    System.out.println("value of b is "+b);
		b.m1();
		b.m2();
		}
	}
