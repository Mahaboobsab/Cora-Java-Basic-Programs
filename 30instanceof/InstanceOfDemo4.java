class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}

class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2");

	}
}


class InstanceOfDemo4
{
	public static void main(String args[])
	{
		A a=new B();
		boolean z= a instanceof A;

	System.out.println("value of z is "+z);
	if (a instanceof B)
	{
		System.out.println("a is refering to B object");
		}
		else
		{
		System.out.println("a is  not refering to B object");
		}
			
		}
	}
