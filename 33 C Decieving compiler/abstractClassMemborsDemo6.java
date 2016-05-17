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
	
	
	
	
class abstractClassMemborsDemo6
{
	public static void main(String args[])
	{
	A a = null;
	System.out.println("val of a is  "+a);
	//A a = new A();
	System.out.println("val of Adress a "+a);
	System.out.println("val of a is  "+a);
	A.m1();//both same
	a.m1();
	B b = new B();
			}
	}
