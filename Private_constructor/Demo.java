class Box
{
	private int w;
	private int h;
	private int d;
	
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
	void show()
	{
		System.out.println("Inside Show method"+w+h+d);
		}
	}


class Demo
{
	public static void main(String args[])
	{

	Box b1;
	b1=new Box(1,2,3);
	System.out.println("value of box b is"+b1);
	int p=b1.volume();
	System.out.println("value of box l is"+p);
	b1.show();
	}
}
