class A
{
	void m1()
	{
		int i;
		i=10;
		System.out.println("val of i is"+i);//error
		 
	}
}

class FinallocalVariableDemo1
{
	public static void main(String args[])
	{
			A a=new A();
			a.m1();
		}
	}
