class A
{
	void m1()
	{
		final int i;//ERROR I IS INITIATEDONLY ONCE
		i=10;
		System.out.println("val of i is"+i);
		 i=2;
		 System.out.println("val of i is"+i);
	}
}

class FinallocalVariableDemo5
{
	public static void main(String args[])
	{
			A a=new A();
			a.m1();
		}
	}
