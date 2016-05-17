abstract class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	void fun1()
	{
		System.out.println("Inside A fun1");
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

class ManyAbstractMethodDemo5
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
		A a=new B();
		System.out.println("value  of a in main"+a);
		a.m1();
		a.m2();
		a.m3();
		a.fun1();
		a.fun();
		//b.fun();Error
		B b=(B)a;
		System.out.println("value  of b in main"+b);
		b.m1();
		b.m2();
		b.m3();
		b.fun();
		a.fun1();
		b.fun1();
		System.out.println("End of main+++++++++++++++++++++++++++++++++++");
		System.out.println("value  of a in main"+a);
		a.m1();
		a.m2();
		a.m3();
		a.fun1();
		}
	}
