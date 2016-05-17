class Box
{
int w;
int h;
int d;
Box (int x,int y,int z)
{
	w=x;
	h=y;
	d=z;
}
int volume()
{
	int l=0;
	l=w*h*d;
	return l;
}
}
class Hello
{
void m1()
{
System.out.println("Inside m1");
}
void m2 (int a)
{
	System.out.println("Inside m1");
    System.out.println("value of a is"+a);

}
void m7(Box z)
{
	System.out.println("value of z is"+z);
	System.out.println("value of w in z is"+z.w);
	System.out.println("value of  in h is"+z.h);
	System.out.println("value of z in d is"+z.d);
	
	}
}
class DiffArguAndParaDemo4
{
	public static void main(String args[])
	{
		Hello h=new Hello();
		int p=10;
		int q=6;
		int r=7;
		Box b=new Box(p,q,r);
	System.out.println("value of w in d is"+b.w);
	System.out.println("value of h in d is"+b.h);
	System.out.println("value of d in d is"+b.d);
	h.m7(b);
	System.out.println("value of w in d is"+b.w);
	System.out.println("value of h in d is"+b.h);
	System.out.println("value of d in d is"+b.d);
}
}
	

		
