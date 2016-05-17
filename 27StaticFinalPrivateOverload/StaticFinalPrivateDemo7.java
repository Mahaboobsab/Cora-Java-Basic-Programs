class  A
{
	int x=10;
	void m1()
	{
		System.out.println("Inside m1 is A");
		}
	void fun()
	{
		System.out.println("Inside fun in A");

		}
	}
class B extends A
{
	static int x=20;
	
	 void fun()
	{
		System.out.println("Inside fun in B");

		}
	}
	
	
	
class StaticFinalPrivateDemo7
{
	public static void main(String args[])
	{
		A a=new B();
		System.out.println("value of x in a is "+a.x);
		a.fun();
		B b=new B();
		System.out.println("value of x in a is "+b.x);
		a=b;
		System.out.println("value of x in a is "+b.x);

		System.out.println("value of x in a is "+a.x);

		}
	}
