class Box
{
	int w;
	int h;
	int d;
	Box (int w,int h,int d)
	{
		System.out.println("value of this is"+this);
		System.out.println("value of this.w is"+this.w);
		System.out.println("value of this.h is"+this.h);
        System.out.println("value of this.d is"+this.d);
        System.out.println("value of w is"+w);
		System.out.println("value of h is"+h);
        System.out.println("value of d is"+d);
		w=w;
		h=h;
		d=d;
		System.out.println("value of this.w is"+this.w);
		System.out.println("value of this.h is"+this.h);
        System.out.println("value of this.d is"+this.d);
        System.out.println("value of w is"+w);
		System.out.println("value of h is"+h);
        System.out.println("value of d is"+d);
        w=w;
		h=h;
		d=d;
		System.out.println("value of this.w is"+this.w);
		System.out.println("value of this.h is"+this.h);
        System.out.println("value of this.d is"+this.d);
        System.out.println("value of w is"+w);
		System.out.println("value of h is"+h);
        System.out.println("value of d is"+d);
		this.w=w;
		this.h=h;
		this.d=12;
		System.out.println("value of this.w is"+this.w);
		System.out.println("value of this.h is"+this.h);
        System.out.println("value of this.d is"+this.d);
		}
		
	int volume()
	{
		int i=0;
		i=this.w*this.h*this.d;
		return i;
		}
}
class ThisInstanceVariableDemo5
{
	public static void main(String args[])
	{
		Box b1;
		b1= new Box(1,2,3);
		System.out.println("value of box is"+b1);
		System.out.println("value of b1 is"+b1.w);
		System.out.println("value of b1 is"+b1.h);
        System.out.println("value of b1 is"+b1.d);
        int x=b1.volume();
        System.out.println("volume is "+x);

		}
	}
