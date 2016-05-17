class Hello
{
	int i=5;
	int x[]=new int [5];
	void m1()
	{
		System.out.println("value of m1 () is"+x);
		System.out.println("value of m1 () ind  is"+x[2]);

		}
	
	
	}

	
	class ArrayInsatnceDemo2
	{
		
	
		public static void main(String args[])
		{
		Hello h=null;
	    h = new Hello();
		System.out.println("value of i in main is"+h.i);

		System.out.println("value of x in main is"+h.x);

		System.out.println("value of 2 ind in main is"+h.x[2]);

	

			
			}
		}
	
	
	
