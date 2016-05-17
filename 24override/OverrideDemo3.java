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
	void m2()
	{
		System.out.println("Inside m2 of B");
		}
	}

class OverrideDemo3
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		a.m2();
		B b= new B();
		b.m1();
		b.m2();//A is having same method but preparance is given to local class that is B
		}
	}
