class  A
{
	void m1()
	{
		System.out.println("Inside m1 i A");
		}
	void fun()//If remove both static then it will print B to access
	{
		System.out.println("Inside fun in A");

		}
	}
class B extends A
{
	 void fun()//IIf remove both static then it will print B to access
	{
		System.out.println("Inside fun in B");

		}
	}
	
	
	
class StaticFinalPrivateDemo6
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a=b;
		b.fun();
		a.fun();
	
		}
	}
