interface A
{
	int x=10;
	void m1();
	void fun();
	}
interface B
{
	int y=20;//when both val are same then you should call with class name
	void m2();
	void fun();
	}
class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside Z m1 method");
		System.out.println("Inside Z m1 method val of x is"+x);
		//System.out.println("Inside Z m1 method val of y is"+x);
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

class ConflictsMemborsDemo12
{
	public static void main(String args[])
	{
		 A a = null;
		 B b = null;
		System.out.println("Inside Main....... method");
		System.out.println("Inside Main method val of x in main method is"+A.x);
		System.out.println("Inside Main method val of x in main  method is"+B.y);
		System.out.println("Inside Main....... method");
		System.out.println("Inside Main method val of x in main method is"+a.x);
		System.out.println("Inside Main method val of x in main  method is"+b.y);
		
		System.out.println();
		
		Z z = null;
		z = new Z();
		System.out.println("Inside Main method val of x in main  method is"+z.x);
		System.out.println("Inside Main method val of x in main  method is"+z.y);
		}
	}
