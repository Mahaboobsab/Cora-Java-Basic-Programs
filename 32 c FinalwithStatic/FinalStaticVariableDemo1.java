class A
{
	final static int i;//By constructor
	static 
	{
		 i=10;
	}
}

class FinalStaticVariableDemo1
{
	public static void main(String args[])
	{
		System.out.println("val of i is "+A.i);
		}
	}
