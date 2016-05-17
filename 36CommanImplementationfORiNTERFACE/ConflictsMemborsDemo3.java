interface A
{
	void m1();
	void fun();
	}
interface B
{
	void m2();
	void fun();
	}
class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside Z m1 method");
		}
		
		public void fun()
	{
		System.out.println("Inside Z fun method");
		}
		
		public void m2()
	{
		System.out.println("Inside Z m1 method");
		}
	
	}

class ConflictsMemborsDemo3
{
	public static void main(String args[])
	{
		A a = new Z();
		a.m1();
	//	a.m2();
	    a.fun();
		}
	}
