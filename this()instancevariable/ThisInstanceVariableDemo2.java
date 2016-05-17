class Box
{
	int w;
	int h;
	int d;
	Box (int x,int y,int z)
	{
		this.w=x;
		this.h=y;
		this.d=z;
		}
	int volume()
	{
		int i=0;
		i=this.w*this.h*this.d;
		return i;
		}
}
class ThisInstanceVariableDemo2
{
	public static void main(String args[])
	{
		Box b1;
		b1= new Box(1,2,3);
		System.out.println("value of b1 is"+b1);
		System.out.println("value of b1 is"+b1.w);
		System.out.println("value of b1 is"+b1.h);
        System.out.println("value of b1 is"+b1.d);
        int x=b1.volume();
        System.out.println("volume is "+x);

		}
	}
