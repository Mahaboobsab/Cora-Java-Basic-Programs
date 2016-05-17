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


class StaticGlobalDemo5
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
Hello h=null;
h=new Hello();
		System.out.println("value of a is "+h.a);//class is loaded only once
			System.out.println("value of a is "+h.a);
				System.out.println("value of a is "+h.a);

		System.out.println("End of main");



		}
	
	}

