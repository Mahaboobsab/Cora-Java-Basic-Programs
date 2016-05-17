class A
{
	static
	{
		System.out.println("Inside A static Block");
		}
		
		{
		System.out.println("Inside A instatce Block");
		}
		
		A( )
		{
		System.out.println("Inside A constructor block");
		}
		
	void m1()
	{
		System.out.println("Inside A m1 method");
		
		}
		
	}
class B extends A
{
	static
	{
		System.out.println("Inside B static Block");
		}
		
		{
		System.out.println("Inside B instatce Block");
		}
		
		B( )
		{
		System.out.println("Inside B constructor block");
		}
		void m2()
	{
		System.out.println("Inside B m2 method");
		
		}
	
}



class SuperClassObjectDemo
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		B b=new B();
		b.m1();
		
		}
	}
