class A
{
	final int i;
	A(int i)        //blocl fial method either can be initiated in instance block or constructor
	{
	this.i=i;	
	}
	
	A()
	{
	i=5;
		}
	
}


class FinalVariableDemo4 
{
	public static void main(String args[])
	{
		A a1=new A(10);
		System.out.println("val of i in a1 is"+a1.i);
		A a2=new A(20);
		System.out.println("val of i in a2 is"+a2.i);
	/*	B b1=new B();
		System.out.println("val of i in b1 is"+b1.i);
		B b2=new B();
		System.out.println("val of i in b2 is"+b2.i);*/
}
}
