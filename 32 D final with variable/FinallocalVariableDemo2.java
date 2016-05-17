class A
{
	void m1()
	{
		final int i;
		i=10;
		System.out.println("val of i is"+i);//error
		 
	}
}

class FinallocalVariableDemo3
{
	public static void main(String args[])
	{
			A a=new A();
			a.m1();
		}
	}
