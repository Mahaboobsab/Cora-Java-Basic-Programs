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
	static void m1(Box z);
	
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
	System.out.println("Inside m1");
	}
}

class CallByReference1
{
	public static void main(String args[])
	{
		Box b=null;
		System.out.println("Val of b is "+b);
		b=new Box(1,2,3);
		System.out.println("val of w is "+b.w);
		System.out.println("val of h is "+b.h);
		System.out.println("val of d is "+b.d);
		}
	}
