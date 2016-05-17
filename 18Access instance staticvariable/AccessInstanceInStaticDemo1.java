class Hello
{
	
	static int x=5;
	int y=9;
	
	
	static void m1()
	{
	
		
		}
void m2()
{
	System.out.println("Inside Instance m2");
	System.out.println("Inside Instance m2"+x);
	System.out.println("Inside Instance m2"+y);
	}
}



class AccessInstanceInStaticDemo1
{
	public static void main(String args[])
	{
		Hello h=null;
	    h=new Hello();
		
		}
	}
