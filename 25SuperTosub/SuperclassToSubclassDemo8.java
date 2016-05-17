class A
{
	int x;
	int y;
	
	void m1()
	{
		System.out.println("Inside m1");
		}
	}
class B extends A
{
	int z;
	void m2()
	{
	System.out.println("Inside m2 class B");

		}
	}

class SuperclassToSubclassDemo8
{
	public static void main(String args[])
	{
		A a=new A();
		a.x=1;
		a.y=2;
		a.m1();
		System.out.println("Val of A is++++++++++++++++"+a);
		System.out.println("Val of x in A is"+a.x);
		System.out.println("Val of y in A is"+a.y);
		B b=new B();
		System.out.println("Val of B is++++++++++++++++"+b);
		b.x=10;
		b.y=20;
		b.z=30;
		System.out.println("Val of x in B is"+b.x);
		System.out.println("Val of y in B is"+b.y);
		System.out.println("Val of z in B is"+b.z);
		a=b;
		System.out.println("Val of  A is++++++++++++++++"+a);
		System.out.println("Val of x in A is"+a.x);
		System.out.println("Val of y in A is"+a.y);
		System.out.println("Val of z in B is"+b.z);
		//a.m2(); Because A is not having m2 method

		//b=a; Error because a is not having contents of A
	}
}
