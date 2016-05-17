abstract class  A
{
static
{
	System.out.println("Inside A static block");
	}

{
	System.out.println("Inside A Instatnce block");
	}
A()
{
	System.out.println("Inside A Constructor block");
	}
	
static void  m1()
{
	System.out.println("Inside A m1");
	}
	
void  m2()
{
	System.out.println("Inside A m2");
	}

}

class B extends A
{
	static
{
	System.out.println("Inside B static block");
	}

{
	System.out.println("Inside B Instatnce block");
	}
B()
{
	System.out.println("Inside B Constructor block");
	}
}
	
	
	
	
class abstractClassMemborsDemo5
{
	public static void main(String args[])
	{
	A a = null;
	A.m1();
	a.m1();
	B b = new B();
			}
	}
