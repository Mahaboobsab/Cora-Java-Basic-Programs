abstract class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
abstract void m2();
abstract void m3();

}

 class B extends A
{
	
	void m2()
	{
		System.out.println("Inside B m2");
		}
		
		void m3()
	{
		System.out.println("Inside B m3");
		}
	
	void fun()
	{
		System.out.println("Inside B fun");
		}
	}

class ManyAbstractMethodDemo
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.fun();
		
		System.out.println("End of main");
		
		}
	}
