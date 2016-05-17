class Hello
{
	void m1()
	{
		System.out.println("Inside m1");
		
		}
	}
	class DiffArgumParmDemo2
	{
		public static void main(String args[])
		{
			Hello h;
			h=new Hello();
			h.m1();
			Hello b;
			b=new Hello();
			b.m1();
			Hello c;
			c=new Hello();
			c.m1();
		}
	}
