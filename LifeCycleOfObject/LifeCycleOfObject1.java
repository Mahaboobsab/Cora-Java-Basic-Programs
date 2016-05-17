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





class LifeCycleOfObject1
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

		
		System.gc();
	System.out.println("Inside the end method");	
		
	}
}
