class Hello
{
	int x=10;
	int y=20;
	Test t=new Test(5);
	static
	{
		System.out.println("Inside Hello static");
		}
		{
		System.out.println("Inside Hello inst");

			}
			Hello()
			{
			   System.out.println("Inside Hello constr");

				}
	void show()
	{
		System.out.println("Inside show");
		System.out.println("the value of x in  show is "+x);
		System.out.println("the value of y in  show is "+y);

 			}
		}
		
class Test
{
	int p;
	static
	{
		System.out.println("Inside test static");
		}
	{
		System.out.println("Inside test inst");
		
		}


	Test(int p)
	{
	System.out.println("Inside test constru");

		this.p=p;
		}
	void m1()
	{
	System.out.println("Inside m1");
	System.out.println("the value of p in m1 is "+p);

		}
	}
	
	class AssociationDemo5
	{
		public static void main(String args[])
		{
			Hello h=null;
			h=new Hello();;
	System.out.println("the value of x is "+h.x);
	System.out.println("the value of y is  "+h.y);
	System.out.println("the value of t is  "+h.t);
	System.out.println("the value of p is  "+h.t.p);
	h.t.m1();
	h.show();
	System.out.println("End main");

			
			}
		}
	
	
	
