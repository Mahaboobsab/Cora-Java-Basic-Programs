class  A
{
	void m1()
	{
		System.out.println("Inside m1 i A");
		}
	static void fun()//If both static then it will aloow to access
	{
		System.out.println("Inside fun in A");

		}
	}
class B extends A
{
	static void fun()//If both static then it will aloow to access
	{
		System.out.println("Inside fun in B");

		}
	}
	
	
	
class StaticFinalPrivateDemo4
{
	public static void main(String args[])
	{
		A a=new A();
		a.fun();
		a.m1();
		
	
		}
	}
