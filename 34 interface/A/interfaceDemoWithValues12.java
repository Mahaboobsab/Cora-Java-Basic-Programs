interface A
{
	 int x=5;
	 int y=6;
	 void m1();
	 void m2();

	 
}


	
class interfaceDemoWithValues12
{
	public static void main(String args[])
	{
	System.out.println("val of x is"+A.x);
	System.out.println("val of y is"+A.y);
	
	System.out.println();
	
	A a = null;
	System.out.println("val of x is"+a.x);
	System.out.println("val of y is"+a.y);
		}
	}
