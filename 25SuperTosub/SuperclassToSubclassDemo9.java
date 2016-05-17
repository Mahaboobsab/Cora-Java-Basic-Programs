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

class SuperclassToSubclassDemo9
{
	public static void main(String args[])
	{
		A a=new B();
		a.x=1;
		a.y=2;
		a.z=3;
		a.m1();
		System.out.println("val of a is"+a);
		System.out.println("val of x in a is"+a.x);
		System.out.println("val of y is"+a.y);
	}
}
