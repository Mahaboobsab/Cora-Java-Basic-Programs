class Box
{
	int w;
	int h;
	int d;
	
    Box(int x, int y,int z)
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
	int p;
	int q;
	Test (int x,int y)
	{
		p=x;
		q=y;
		}
	void m1()
	{
		System.out.println("Inside test m1 method");
		}
	void m2(int a)
	{
		System.out.println("Inside m2 method");
		System.out.println("Inside m2 method val of a is"+a);
		}
	}

class Hello
{
	void m1()
	{
			System.out.println("Inside Hello m1 method ");
		}
	void m2(int a)
	{
		System.out.println("Inside hellp m2 method");
		System.out.println("Inside hello  m2 method val of a is"+a);
		}
	int []m9(Test p,Box b,boolean s)
	{
		System.out.println("Inside hello  mp method");
		System.out.println("Inside Hello method val p is "+p);
		System.out.println("Inside Hello method val p is "+p.p);
		System.out.println("Inside Hello method val q is "+p.q);
		
		System.out.println("Inside Hello method val b is "+b);
		System.out.println("Inside Hello method val p is "+b.w);
		System.out.println("Inside Hello method val p is "+b.h);
		System.out.println("Inside Hello method val p is "+b.d);
		
		System.out.println("Inside Hello method val s is "+s);
		
		
		int a[]={1,2,3};
		return a;
		}
	
	
	void m7(int a[])
	{
		System.out.println("Inside m7 method");
		for (int o:a)
		System.out.println(o);
		}
	}


class DiffDataArgAndParamDemo1
{
	public static  void main(String[] args)
	{
		Hello h=new Hello();
		/*Test t =new Test(7,8);
		
		int [] res = h.m9(t,new Box(1,2,3),true); OR*/
		
		int [] res = h.m9(new Test(7,8),new Box(1,2,3),true);
		System.out.println("Inside Res");
		System.out.println(res);
		for(int x:res)
		{
			System.out.println(x);
			}
		h.m1();
		h.m2(5);
		
		int []b={4,5,8,6,9};
		h.m7(b);
	
		}
	}
