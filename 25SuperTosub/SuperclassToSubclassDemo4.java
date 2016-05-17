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

class SuperclassToSubclassDemo4
{
	public static void main(String args[])
	{
		A a=new A();
		a.x=1;
		a.y=2;
		a.m1();
		System.out.println("Val of x in A is"+a.x);
		System.out.println("Val of y in A is"+a.y);
		B b=new B();
		b.z=30;
		System.out.println("Val of z in B is"+b.z);
		a=b;//
		//b=a;
		//A a = new B();//incomprtable type error
		}
	}

