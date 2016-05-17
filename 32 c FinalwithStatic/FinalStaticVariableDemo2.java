class A
{
	final static int i;
	A(int x)
	{
		 i=x;
	}
}

class FinalStaticVariableDemo2
{
	public static void main(String args[])
	{
		System.out.println("val of i is "+A.i);//error istance block will not compile
		}
	}
