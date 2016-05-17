class Box
{
	int w;
	int h;
	int d;
	
		int volume()
		{
		int l;
		l=w*h*d;
		return l;
	}
};
class NullDemo1
{
	public static void main(String args[])
	{
		Box b=null;
		b=new Box();
		System.out.println("Value of b is"+b);
		System.out.println("Value of w is"+b.w);
		System.out.println("Value of h is"+b.h);
		System.out.println("Value of d is"+b.d);
		b.w=1;
		b.h=2;
		b.d=3;
		System.out.println("Value of w is"+b.w);
		System.out.println("Value of h is"+b.h);
		System.out.println("Value of d is"+b.d);
		
		Box b1=null;
		b1=new Box();
		System.out.println("Value of b1 is"+b1);
		System.out.println("Value of w is"+b1.w);
		System.out.println("Value of h is"+b1.h);
		System.out.println("Value of d is"+b1.d);
		b1.w=11;
		b1.h=22;
		b1.d=33;
		System.out.println("Value of w is"+b1.w);
		System.out.println("Value of h is"+b1.h);
		System.out.println("Value of d is"+b1.d);
		
		Box b2;
		b2=b1;
		System.out.println("Value of b2 is"+b2);
		System.out.println("Value of w is"+b2.w);
		System.out.println("Value of h is"+b2.h);
		System.out.println("Value of d is"+b2.d);
		Box b3;
		b3=b2;
		System.out.println("Value of b3 is"+b3);
		System.out.println("Value of w is"+b3.w);
		System.out.println("Value of h is"+b3.h);
		System.out.println("Value of d is"+b3.d);
		b3.w=111;
		b3.h=222;
		b3.d=333;
		System.out.println("Value of w b1 is"+b1.w);
		System.out.println("Value of h b1 is"+b1.h);
		System.out.println("Value of d b1 is"+b1.d);
		System.out.println("Value of w b2 is"+b2.w);
		System.out.println("Value of h b2 is"+b2.h);
		System.out.println("Value of d b2 is"+b2.d);
		b1=b;
		System.out.println("Value of w is"+b1.w);
		System.out.println("Value of h is"+b1.h);
		System.out.println("Value of d is"+b1.d);
	}
}
