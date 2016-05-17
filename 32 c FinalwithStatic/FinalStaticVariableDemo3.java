class A
{
	final static int i;
	void m1(int x)
	{
		 i=x;
	}
}

class FinalStaticVariableDemo3
{
	public static void main(String args[])
	{
		System.out.println("val of i is "+A.i);//error methods will not compile
		}
	}
