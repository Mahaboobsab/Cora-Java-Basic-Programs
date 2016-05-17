class A
{
	final int i=10;
	}


class FinalVariableDemo
{
	public static void main(String args[])
	{
		A a1=new A();
		System.out.println("val of i in a1 is"+a1.i);
		A a2=new A();
		System.out.println("val of i in a2 is"+a2.i);
}
}
