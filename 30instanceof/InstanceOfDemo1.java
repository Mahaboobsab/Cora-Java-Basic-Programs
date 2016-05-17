class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	}


class InstanceOfDemo1
{
	public static void main(String args[])
	{
		A a=new A();
		boolean B= a instanceof A;

	System.out.println("value of B is "+B);
			
		}
	}
