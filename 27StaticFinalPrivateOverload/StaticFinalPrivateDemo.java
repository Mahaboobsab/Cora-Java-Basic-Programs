class  A
{
	void m1()
	{
		System.out.println("Inside m1 i A");
		}
	private void fun()
	{
		System.out.println("Inside fun in A");

		}
	}
class B extends A
{
	void fun()
	{
		System.out.println("Inside fun in B");

		}
	}
	
	
	
class StaticFinalPrivateDemo
{
	public static void main(String args[])
	{
		
	A a=new B();
	a.fun();//I cannot access because its private
		}
	}
