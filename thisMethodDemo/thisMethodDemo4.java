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




class thisMethodDemo4
{
	public static void main(String args[])
	{
		Hello h=new Hello();
		h.m1();
		h.m2();


		}
	
	}
