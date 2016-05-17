class Hello
{
	static int a=10;
	       int b;
		
		
	}




class StaticGlobalDemo2
{
	public static void main(String args[])
	{
		
Hello h1=null;
Hello h2=null;
Hello h3=null;
h1=new Hello();
System.out.println("value of a in main is"+h1.a);
System.out.println("value of b in main is"+h1.b);
h1.b=10;
System.out.println("value of b in main is"+h1.b);
h2=new Hello();
System.out.println("value of a in main is"+h2.a);
System.out.println("value of b in main is"+h2.b);
h2.b=20;
System.out.println("value of b in main is"+h2.b);

		}
	
	}
