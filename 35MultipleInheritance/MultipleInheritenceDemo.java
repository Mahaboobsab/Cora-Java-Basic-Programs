interface A
{
	void m1();
	void m2();
	}
interface B
{
	void m3();
	void m4();
	}
class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside class z m1 method");
		}
		public void m2()
	{
		System.out.println("Inside class z m2 method");
		}
		public void m3()
	{
		System.out.println("Inside class z m3 method");
		}
		public void m4()
	{
		System.out.println("Inside class z m4 method");
		}
		 void fun()
	{
		System.out.println("Inside class z fun method");
		}
	}
	

class MultipleInheritenceDemo
{
	public static void main(String args[])
	{
		A a = null;
		B b = null;
		Z z= null;
		z = new Z();
		z.m1();
		z.m2();
		z.m3();
		z.m4();
		z.fun();
		}
	}



















