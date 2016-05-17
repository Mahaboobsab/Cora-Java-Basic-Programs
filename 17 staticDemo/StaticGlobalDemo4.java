class Hello
{
	static {
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


class StaticGlobalDemo4
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
Hello h=null;//class is not loaded
		System.out.println("End of main");



		}
	
	}

