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
		super.m2();//If I want to call it from A then use super it refers to super class
		}
	}

class OverrideDemo5
{
	public static void main(String args[])
	{
		
		B b= new B();
		b.m1();
		b.m2();
		}
	}
