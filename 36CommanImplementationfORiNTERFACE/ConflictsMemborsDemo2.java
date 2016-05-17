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
		System.out.println("Inside Z m2 method");
		}
	
	}

class ConflictsMemborsDemo2
{
	public static void main(String args[])
	{
	    B b = new Z();
		//b.m1();
		b.m2();
	    b.fun();
		}
	}
