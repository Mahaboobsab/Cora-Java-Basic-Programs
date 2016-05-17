class A
{
	void m1()
	{
		System.out.println("Inside m1 of A");
		}
	void fun()
	{
		System.out.println("Inside fun of A");
		}
	}

class B extends A
{
	
	void m2()
	{
		System.out.println("Inside m2 of B");
		
		}
		void fun()
	{
		//super.fun();
		System.out.println("Inside fun of B");
		
		}
	}
		class C extends B
		{
			
	void m3()
	{
		System.out.println("Inside m3 of C");
		
		}	
    void fun()
		{
	super.fun();
	A a=new A();;
	a.fun();
    System.out.println("Inside fun of C");

				}
	}

class OverrideDemo8
{
	public static void main(String args[])
	{
	A a=new A();
	a.m1();
	a.fun();
	B b =new B();
	b.m1();
	b.m2();
	b.fun();
	C c=new C();
	c.m1();
	c.m2();
	c.m3();
	c.fun();
		}
	}
