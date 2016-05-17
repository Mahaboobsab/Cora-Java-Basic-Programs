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

class ManyAbstractMethodDemo1
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		//b.fun();//Error
		
		System.out.println("End of main");
		
		}
	}
