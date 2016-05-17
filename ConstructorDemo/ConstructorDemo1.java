class Box
{
	int w,h,d,m;
	Box(int x,int y,int z,int n)
	{
		w=x;
		h=y;
		d=z;
		m=n;
	}
		int volume()
		{
		int l;
		l=w*h*d*m;
		return l;
	}
	int sabiya()
	{
		int love;
		love=w+h+d+m;
		return love;
}
}
		
	
class ConstructorDemo1
{
	public static void main(String args[])
	{
		Box b1;
		b1=new Box(4,5,5,9);
		System.out.println("The value of w in b1 is"+b1.w);

		System.out.println("The value of  h in b1 is"+b1.h);

		System.out.println("The value of d in b1 is"+b1.d);
		System.out.println("The value of m in b1 is"+b1.m);
		
		
		int x=b1.volume();
		int k=b1.sabiya();
		System.out.println("The value of volume in b1 is"+x);
		System.out.println("The value of sabiya in b2 is"+k);
		System.out.println("");
		
		
		Box b2;
		b2=new Box(4,5,6,7);
		System.out.println("The value of w in b1 is"+b2.w);

		System.out.println("The value of  h in b1 is"+b2.h);

		System.out.println("The value of d in b1 is"+b2.d);
		System.out.println("The value of d in b1 is"+b2.m);

		x=b2.volume();
		k=b2.sabiya();
		System.out.println("The value of volume in b1 is"+x);
			System.out.println("The value of sabiya in b2 is"+k);
		System.out.println("");

		
		
		
	
	}
}
		
		
		
