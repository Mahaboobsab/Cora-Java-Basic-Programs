class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}

class B
{
	void m2()
	{
		System.out.println("Inside B m2");

	}
}


class InstanceOfDemo6
{
	public static void main(String args[])
	{
		A a=new A();
		boolean z= a instanceof B;//if subclass and superclass are not related then error

	System.out.println("value of z is "+z);
	if (a instanceof B)
	{
		System.out.println("a is refering to A object");
		}
		else
		{
		System.out.println("a is  not refering to A object");
		}
			
		}
	}
