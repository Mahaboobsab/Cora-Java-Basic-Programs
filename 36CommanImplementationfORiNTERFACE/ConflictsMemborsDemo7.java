interface A
{
	int x=10;
	void m1();
	void fun();
	}
interface B
{
	int y=20;
	void m2();
	void fun();
	}
class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside Z m1 method");
		System.out.println("Inside Z m1 method val of x is"+x);
		System.out.println("Inside Z m1 method val of y is"+y);
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

class ConflictsMemborsDemo7
{
	public static void main(String args[])
	{
		 A a = null;
		 B b = null;
		System.out.println("Inside Main....... method");
		System.out.println("Inside Main method val of x in z method is"+Z.x);
		System.out.println("Inside Main method val of y in z method is"+Z.y);
		}
	}
