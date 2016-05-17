class Hello
{
	static int a=10;
	static int b=20;
	static void m1()
	{
	System.out.println("value of a is"+a);
    System.out.println("value of b is"+b);
	
		}
		
	}




class StaticDemo
{
	public static void main(String args[])
	{
		Hello h=null;//1st way with reference variable
		System.out.println("value of a in main is is"+h.a);
		System.out.println("value of b in main is is"+h.b);
		h.m1();
	


		}
	
	}
