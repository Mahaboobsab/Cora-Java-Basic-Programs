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




class StaticDemo2
{
	public static void main(String args[])
	{
		Hello h=null;//1st way with reference variable
		System.out.println("value of a in main is is"+h.a);
		System.out.println("value of b in main is is"+h.b);
		h.m1();
		//with class name
		System.out.println("value of a in main is is"+Hello.a);
		System.out.println("value of b in main is is"+Hello.b);
		//3rd way with object
		Hello h1=null;
		h1=new Hello();
		System.out.println("value of a in main is is"+h1.a);
		System.out.println("value of b in main is is"+h1.b);
		h1.m1();
 

		}
	
	}
