class Hello
{
	int a=5;
	static 
	{
	System.out.println("Inside static block");	
}
{

	System.out.println("Inside Instance block");	

		}
		Hello()
		{
		System.out.println("Inside contructor");	
				}
	void m1()
	{
			System.out.println("Inside m1 method");	

		}
		public void finalize()
		{
	System.out.println("Inside finalize method");	

			}

}


class StaticGlobalDemo10
{
	public static void main(String args[])
	{
		System.out.println("Begin main");
		Hello h=null;
		Hello h1=null;
		Hello h2=null;
		h=new Hello();
		h1=new Hello();
		h2=new Hello();
		h1=null;
		h2=h1;
	System.gc();
		System.out.println("ENd main");

		


		}
	
	}

