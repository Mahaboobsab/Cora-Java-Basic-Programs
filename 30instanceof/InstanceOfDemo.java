class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}


class InstanceOfDemo
{
	public static void main(String args[])
	{
		A a=new A();
		if (a instanceof A)
		{
	System.out.println("a is referring to A object");
			}
		}
	}
