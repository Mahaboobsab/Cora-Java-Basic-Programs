class Hello
{
	int x;
	int y;
	Test t=new Test(22);
	static
	{
		System.out.println("Inside Hello static++++++++++++++++");
		}
		{
		System.out.println("Inside Hello inst");

			}
			Hello()
			{
			   System.out.println("Inside Hello constr++++++++++++");

				}
				void fun(int x,int y,Test t)
		{
	System.out.println("the value of x in fun is "+x);
	System.out.println("the value of y in fun is  "+y);
	System.out.println("the value of t in fun is  "+t);
	System.out.println("the value of x in fun is "+this.x);
	System.out.println("the value of y in fun is  "+this.y);
	System.out.println("the value of t in fun is  "+this.t);
	this.x=x;
	this.y=y;
	this.t=t;
	System.out.println("the value of x in fun is +++++++++++++++++++++"+x);
	System.out.println("the value of y in fun is  "+y);
	System.out.println("the value of t in fun is  "+t);
	System.out.println("the value of x in fun is "+this.x);
	System.out.println("the value of y in fun is  "+this.y);
	System.out.println("the value of t in fun is  "+this.t);
	}
	void show()
	{
		System.out.println("Inside show+++++++++++++++++");
		System.out.println("the value of x in  show is "+x);
		System.out.println("the value of y in  show is "+y);

 			
		}
	}
		
class Test
{
	int p;
	static
	{
		System.out.println("Inside test static+++++++++++");
		}
	{
		System.out.println("Inside test inst++++++++++++++");
		
		}


	Test(int p)
	{
	System.out.println("Inside test constru+++++++++++");

		this.p=p;
		}
	void m1()
	{
	System.out.println("Inside m1++++++++++++++++++++");
	System.out.println("the value of p in m1 is "+p);

		}
		
		
			}
		
		
	
	
	class AssociationDemo6
	{
		public static void main(String args[])
		{
			Hello h=null;
			h=new Hello();;
	System.out.println("the value of x is "+h.x);
	System.out.println("the value of y is  "+h.y);
	System.out.println("the value of t is  "+h.t);
	int p=10;
	int q=20;
	Test t=new Test(5);
	System.out.println("the value of t in main is "+t);
	h.fun(p,q,t);
	System.out.println("the value of x main+++++++++++++++is  "+h.x);
	System.out.println("the value of y is  "+h.y);
	System.out.println("the value of t is  "+h.t);
	System.out.println("the value of p is  "+h.t.p);
	h.t.m1();
	h.show();
	System.out.println("End main++++++++++++++");

			
			}
		}
	
	
	
