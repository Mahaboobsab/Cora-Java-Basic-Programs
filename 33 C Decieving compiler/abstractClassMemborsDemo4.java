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
	
void  m1()
{
	System.out.println("Inside A m1");
	}
	
void  m2()
{
	System.out.println("Inside A m2");
	}

}

class abstractClassMemborsDemo4
{
	public static void main(String args[])
	{
	A a = null;
	//A a = new A(); not allow to create an object but cmpiles
	//a.m1();
	
			}
	}
