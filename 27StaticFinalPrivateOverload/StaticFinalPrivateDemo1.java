class  A
{
	void m1()
	{
		System.out.println("Inside m1 i A");
		}
	final void fun()
	{
		System.out.println("Inside fun in A");

		}
	}
class B extends A
{
	void fun()//By final I cannot override
	{
		System.out.println("Inside fun in B");

		}
	}
	
	
	
class StaticFinalPrivateDemo1
{
	public static void main(String args[])
	{
		
	
		}
	}
