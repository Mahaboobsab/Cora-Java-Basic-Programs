class A
{
	 int i=10;
	void m1(int x)
	{
		i=x;
		}
	}


class FinalVariableDemo1
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.m1(10);
		System.out.println("val of i in a1 is"+a1.i);
		A a2=new A();
		a2.m1(20);
		System.out.println("val of i in a2 is"+a2.i);
}
}
