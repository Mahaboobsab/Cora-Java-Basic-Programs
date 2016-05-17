class Hello
{
	int i=5;
	int x[];
	
	void m1()
	{
		System.out.println("value of m1 () is"+x);
		System.out.println("value of m1 () ind  is"+x[2]);

		}
	}

	
	class ArrayInsatnceDemo4
	{
	
		public static void main(String args[])
		{
			Hello h=null;
			h = new Hello();
		System.out.println("value of i in main is"+h.i);
		System.out.println("value of x in main is"+h.x);
		int p[]={100,200,300};
		h.x=p;
		System.out.println("value of i in main is"+h.x[1]);
		System.out.println("value of i in main is"+h.x[2]);
		h.m1();

			
			}
		}
	
	
	
