class Box
{
	int w,h,d;
	Box (int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
		
		}
void fun()
{
	System.out.println("Inside box fun");
	}
	
void m1(Box z)
{
	System.out.println("val of m1 in z is"+z);
	}
	
int volume()
{
			

	int z=0;
	z=w*h*d;
	return z;	
}
	}
	
class Boxweight extends Box
{
	int m;
	Boxweight(int w,int h,int d,int m)
	{
	super(w,h,d);
	this.m=m;
}
	
void meth()
{
	System.out.println("Inside boxwight meth");
	}
}
class Hello
{
	void m1(Boxweight z)
	{
		System.out.println("Value of z is " + z);
		System.out.println("Value of w in z is " + z.w);
		System.out.println("Value of h in z is " + z.h);
		System.out.println("Value of d in z is " + z.d);
		System.out.println("Value of m in z is " + z.m);
		z.fun();
		z.meth();
	}

}
class SubclassArgumentAndretuentypeDemo3
{
	public static void main (String args[])
	{
		Boxweight bw=new Boxweight(5,6,7,8);
System.out.println("val of bw is"+bw);
System.out.println("val of w in bw  is"+bw.w);
System.out.println("val of h in bw  is"+bw.h);
System.out.println("val of d in bw  is"+bw.d);
System.out.println("val of m in bw  is"+bw.m);
bw.fun();
bw.meth();
bw.m1(bw);

		}
	}
