class A
{
	void m1()//concrete method
	{
		System.out.println("Inside A m1");
		}

void m2()//concrete method
	{
		System.out.println("Inside A m2");
		}
}

class AbstractClassDemo
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		a.m2();
		}
	}
