class A
{
	void m1()
	{
		final int i;
		int a=10;
		int b=20;
		i=a+b;
		System.out.println("val of i is"+i);
		 
	}
}

class FinallocalVariableDemo6
{
	public static void main(String args[])
	{
			A a=new A();
			a.m1();
		}
	}
