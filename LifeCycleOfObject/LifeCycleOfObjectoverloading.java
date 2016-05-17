class Hello
{
	Hello()
	{
		System.out.println("Inside the constructor.....");
		}

void m1()
{
		System.out.println("Inside the m1 method");	
	}
void m2()
{
		System.out.println("Inside the m2 method");	
	}
	void m3()
{
		System.out.println("Inside the m3 method");	
	}
	public void finalize()
	{
		System.out.println("Inside the finalize method++++++++++");	
		}
			public void finalize (int a)
			{
			System.out.println("Inside finalize() method with int a+++++++******");

				}
	}





class LifeCycleOfObjectoverloading
{
	public static void main(String args[])
	{
		
		Hello h1=null;
		Hello h2=null;
		Hello h3=null;
		Hello h4=null;
		Hello h5=null;
		Hello h6=null;
		h1=new Hello();
		h2=new Hello();
		h3=new Hello();
		h4=new Hello();
		h5=new Hello();
		h6=new Hello();
		h1.m1();
		h2.m1();
		h3.m1();
		h4.m1();
		h5.m1();
		h5.m2();
		h2=null;
		h1=null;
		System.gc();
		
		h3=null;
		h4=null;
		h5=null;
		System.gc();
		h1=null;
		System.gc();
	System.out.println("End Of  finalize() method with int a******Meheboob");

		
	}
	
}
