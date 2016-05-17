class Hello
{
	
	static int x=5;
	int y=9;
	int c=3;
	
	
 static void m1()
{
	System.out.println("Inside Instance m2");
	System.out.println("Inside Instance m2"+x);
	Hello h=null;
    h=new Hello();
	System.out.println("Inside Instance m1"+x);
	//System.out.println("Inside Instance m1"+y);//I cannot access it directly
	System.out.println("Inside Instance m1"+h.y);
	}
	void m2()
	{
	System.out.println("Inside Instance m2");
	System.out.println("Inside Instance m2"+x);
	System.out.println("Inside Instance m2"+y);
		
		}
}



class AccessInstanceInStaticDemo3
{
	public static void main(String args[])
	{
		
	Hello d=new Hello();
	d.m1(55);
	

		}
	}
