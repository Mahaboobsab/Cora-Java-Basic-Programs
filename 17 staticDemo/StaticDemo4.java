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




class StaticDemo4
{
	public static void main(String args[])
	{
		
Hello h1;
h1=new Hello();
System.out.println("value of a in main  is"+h1.a);
h1.m1();
System.out.println("value of b in main  is"+h1.b);
System.out.println("end of main");


		}
	
	}
