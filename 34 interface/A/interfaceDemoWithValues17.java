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

	
class interfaceDemoWithValues17
{
	public static void main(String args[])
	{
		A a=null;
		//a.x=11; because public static final variables
		//a.y=12;
		
		B b=null;
		//b.x=1;
		//b.y=11;
		
		}
	}
