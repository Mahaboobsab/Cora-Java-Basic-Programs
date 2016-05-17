class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}


class InstanceOfDemo3
{
	public static void main(String args[])
	{
		A a=null;
		//A a=new A();
		boolean b= a instanceof A;

	System.out.println("value of B is "+b);
	if (a instanceof A)
	{
		System.out.println("a is refering to A object");
		}
		else
		{
		System.out.println("a is  not refering to A object");
		}
			
		}
	}
