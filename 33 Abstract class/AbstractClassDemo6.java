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

 class B extends A//its mandataory to override m3 error or make it as abstract class
{
	
	void m4()
	{
		System.out.println("Inside B m4");
		}
	}

class AbstractClassDemo6
{
	public static void main(String args[])
	{
		System.out.println("Hello Meheboob AbstractClass B is abstract; cannot be instantiated");
		
		}
	}
