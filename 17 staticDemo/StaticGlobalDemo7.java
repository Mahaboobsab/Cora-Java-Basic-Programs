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


class StaticGlobalDemo7
{
	public static void main(String args[])
	{
		System.out.println("Begin main");
		Hello h=null;
		System.out.println("Value of a is"+h.a);
		h=new Hello();
		System.out.println("ENd main");

		


		}
	
	}

