class A
{
	void m1()
	{
		System.out.println("Inside m1 of A");
		}
	void m2()
	{
		System.out.println("Inside m2 of A");
		}
	}

class B extends A
{
	void m3()
	{
		System.out.println("Inside m3 of B");
		}
	}

class OverrideDemo4
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		a.m2();
		B b= new B();
		b.m1();
		b.m3();
		}
	}
