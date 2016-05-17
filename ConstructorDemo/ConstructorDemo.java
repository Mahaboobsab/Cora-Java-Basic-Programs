class Box
{
int w,h,d;
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
class ConstructorDemo
{
	public static void main(String args[])
	{
		Box b1;
		b1=new Box(1,2,3);
		System.out.println("The value of w is"+b1.w);
		System.out.println("The value of h is"+b1.h);
		System.out.println("The value of d is"+b1.d);
		
		int x=b1.volume();
		System.out.println("The valueme of Box is"+x);
		System.out.println("");	
		Box b2;
		b2=new Box(4,5,6);
		System.out.println("The value of w is"+b2.w);
		System.out.println("The value of h is"+b2.h);
		System.out.println("The value of d is"+b2.d);
		 x=b2.volume();
		System.out.println("The valueme of Box is"+x);
		System.out.println("");
		Box b3;
		b3=new Box(8,10,16);
		System.out.println("The value of w is"+b3.w);
		System.out.println("The value of h is"+b3.h);
		System.out.println("The value of d is"+b3.d);
		 x=b3.volume();
		System.out.println("The valueme of Box is"+x);
		
		
		
		
	
	}
}
		
		
		
