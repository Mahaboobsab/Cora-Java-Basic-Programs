interface A
{
	 int x=5;
	 int y=6;
	 void m1();
	 void m2();

	 
}

class B implements A
{
	public void m1()
	{
		System.out.println("val of x class B m1 is"+x);
	System.out.println("val of y class B m1 is"+y);
		}
	public void m2()
	{
		System.out.println("val of x class b m2 is"+x);
	System.out.println("val of y class B m2 is"+y);
		}
	}

	
class interfaceDemoWithValues15
{
	public static void main(String args[])
	{
		B b=null;
		System.out.println("val of x class main with b is"+b.x);
		System.out.println("val of y class main with b is"+b.y);
		
		}
	}
