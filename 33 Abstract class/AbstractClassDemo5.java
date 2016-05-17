abstract class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}

void m2()
	{
		System.out.println("Inside A m2");
		}
		
abstract void m3();
}

abstract class B extends A
{
	
	void m4()
	{
		System.out.println("Inside B m4");
		}
	}

class AbstractClassDemo5
{
	public static void main(String args[])
	{

		
		
		System.out.println("Hello Meheboob AbstractClass B is abstract; cannot be instantiated");
		
		}
	}
