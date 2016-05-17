class Hello
{
	int x;
	int y;
	Test t;
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
	void m1()
	{
	System.out.println("Inside m1");
	System.out.println("the value of p in m1 is "+p);

		}
	}
	
	class AssociationDemo
	{
		public static void main(String args[])
		{
			Hello h=null;
			h=new Hello();;
	System.out.println("the value of x is "+h.x);
	System.out.println("the value of y is  "+h.y);
	System.out.println("the value of t is  "+h.t);

			
			}
		}
	
	
	
