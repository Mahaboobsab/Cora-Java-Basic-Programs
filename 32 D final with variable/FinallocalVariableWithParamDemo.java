class A
{
	void m1()
	{
		final int i = 10;
		
		System.out.println("val of i is"+i);
		 
	}
	void m2(int p)
	{
		System.out.println("val of p is"+p);
		}
}

class FinallocalVariableWithParamDemo
{
	public static void main(String args[])
	{
			A a=new A();
			a.m2(5);
		}
	}
