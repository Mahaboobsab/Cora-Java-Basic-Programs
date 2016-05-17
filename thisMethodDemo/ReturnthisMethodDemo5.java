class Hello
{
	Hello()
	{
		System.out.println("Inside the constructor");
		}
	void m1()
	{
	System.out.println("Inside the m1");
		}
		Hello m2()
		{
	System.out.println("Inside the m2");
	return this;
		}
		
	}




class ReturnthisMethodDemo5
{
	public static void main(String args[])
	{
		Hello h=null;
		Hello h1=null;
		h=new Hello();
	    System.out.println("Inside the main"+h);
	  h1=h.m2();
	    System.out.println("Inside the main"+h1);


		h.m1();
		h.m2();


		}
	
	}
