class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}


class InstanceOfDemo2
{
	public static void main(String args[])
	{
		A a=new A();
		boolean B= a instanceof A;

	System.out.println("value of B is "+B);
	if (a instanceof A)
	{
		System.out.println("a is refering to A object");
		}
			
		}
	}
