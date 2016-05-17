class Hello
{
	Hello()
	{
		System.out.println("Inside the constructor");
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
		System.out.println("Inside the finalize method");	
		}
	}





class LifeCycleOfObject2
{
	public static void main(String args[])
	{
		System.out.println("Inside the Begin method");
		Hello h1=null;
		Hello h2=null;
		Hello h3=null;
		Hello h4=null;
		Hello h5=null;
		h1=new Hello();
		h2=new Hello();
		h3=new Hello();
		h4=new Hello();
		h5=new Hello();
		h1.m1();
		h2.m1();
		h3.m1();
		h4.m1();
		h5.m1();
		h5=new Hello();//here memory is getting wasted so finalize method got executed
		h1=new Hello();
		h1=null;
		h2=h3;
			
	System.gc();
	System.out.println("Inside the end method");	
		
	}
}
