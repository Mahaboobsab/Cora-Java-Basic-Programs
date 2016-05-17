abstract class A
{
	void m1()//concrete method
	{
		System.out.println("Inside A m1");
		}

void m2()//concrete method
	{
		System.out.println("Inside A m2");
		}
abstract void m3();
{
			System.out.println("Inside Abstarct method m3");//its trated as block and executes first

	}
}
class B extends A
{
	void m3()//overriding of m3 method is mandatary here
	{
		System.out.println("Inside B m3");

		}
	}

class AbstractClassDemo2
{
	public static void main(String args[])
	{
		A a=null;
		B b=null;
		b=new B();
		b.m1();
		b.m2();
		b.m3();
		a=b;
		a.m1();
		a.m2();
		a.m3();
		}
	}
