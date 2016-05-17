class Box
{
	int w;
	int h;
	int d;
	
	
	Box(int x,int y,int z)
	{
			w=x;
			h=y;
			d=z;
		}
	
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
		}
	}
	
class Test
{
	int x;
	int y;
	Test(int p,int q)
	{
		x=p;
		y=q;
		}
	void m1()
	{
		System.out.println("Inside m1 method");
		}
	};


class CallByReferenceDemomine
{
	public static void main (String[] args)
	{
		System.out.println("Begin main");
		
	
		Box b=null;
		b=m3();
		System.out.println("value of box b is+++++++++"+b);
		System.out.println("Value of w is "+b.w);
		System.out.println("Value of h is "+b.h);
		System.out.println("Value of d is "+b.d);
		
		Test t=new Test(5,6);
		System.out.println("Inside test method value of test t is------------"+t);
		System.out.println("val of x in test t is"+t.x);
		System.out.println("val of x in test t is"+t.y);
		m2(t);
		System.out.println("val of x in after modification test t is"+t.x);
		System.out.println("val of x in after modification test t is"+t.y);
	}
		
		static Box m3()
		{
			int p=10;
			int q=20;
			int r=30;
		Box m = new Box(p,q,r);
		
		System.out.println("value of box m is+++++++++"+m);
		System.out.println("Value of w is "+m.w);
		System.out.println("Value of h is "+m.h);
		System.out.println("Value of d is "+m.d);
	   return m;
	
			}
			
		static void m2(Test p)
		{
				System.out.println("Val of x in m2 is**************"+p.x);
				System.out.println("Val of y in m2 is"+p.y);
				p.x=786;
				p.y=789;
				System.out.println("Val of x in m2 is**************"+p.x);
				System.out.println("Val of y in m2 is"+p.y);
				
			}
		
	}
