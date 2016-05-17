class A
{
	void m1()
	{
		final int i = 10;
		
		System.out.println("val of i is"+i);
		 
	}
	void m2(final int p)
	{
		System.out.println("val of p is"+p);
		p++;//Error
		System.out.println("val of p is"+p);
		int a=5;
		int b=8;
		p=a+b;//Error
		System.out.println("val of p is"+p);


		}
}

class FinallocalVariableWithParamDemo2
{
	public static void main(String args[])
	{
			A a=new A();
			a.m2(5);
			a.m1();
		}
	}
