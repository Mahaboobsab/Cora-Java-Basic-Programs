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
		void m1()
	{
		System.out.println("Inside Class B m1");
		}
	}

class SuperclassToSubclassDemo10
{
	public static void main(String args[])
	{
		A a=new B();
		a.x=1;
		a.y=2;
		a.m1();
		System.out.println("val of a is"+a);
		System.out.println("val of x in a is"+a.x);
		System.out.println("val of y is"+a.y);
		System.out.println("val of y is"+B.y);
		//a.z=3; Error because not present in A object
		//a.m2();
		//a.m1();
	}
}
