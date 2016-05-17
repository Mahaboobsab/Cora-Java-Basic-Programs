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

class InstanceOfDemo11
{
	public static void main(String args[])
	{
		A a=new C();
		
		
		/*if (a instanceof A)
		{
			System.out.println("a is refering to A object");
			a.m1();
		
	}*/
		if (a instanceof B)
		{
			System.out.println("a is refering to B object");
			
		B b=(B)a;
		System.out.println("val of b is"+b);
		b.m1();
		b.m2();
	}
		else if(a instanceof C)
		{
		System.out.println("a is refering to C object");
		C c=(C)a;
		System.out.println("val of c is"+c);
		c.m1();
		c.m3();
			}
		else if(a instanceof D)
		{
		System.out.println("a is refering to D object");
		D d=(D)a;
		System.out.println("val of d is"+d);
		d.m1();
		d.m4();
		}
		else
		{
		System.out.println("a is not refering to any object");	
			}
		
	}
}
