class Hello
{
	
	static int x=5;
	int y=9;
	
	
	
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



class AccessInstanceInStaticDemo2
{
	public static void main(String args[])
	{
		Hello h=null;
	    h=new Hello();
	System.out.println("Inside main"+h.x);

		}
	}
