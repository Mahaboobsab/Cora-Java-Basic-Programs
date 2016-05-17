class Hello
{
	int x;
	static int m1()
	{
		int c=x;
		
		System.out.println("Inside m1"+c);
		
		}
	}
	class DiffArgumParmDemo3
	{
		public static void main(String args[])
		{
			Hello h;
			h=new Hello();
			int p=5;
			
			h.m1(p);
			
		}
	}
