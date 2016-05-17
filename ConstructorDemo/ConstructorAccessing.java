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
		int l=0;
		l=w*h*d;
		return l;
}
void m1()
{
	System.out.println("inside m1");
	}
	void m2()
{
	System.out.println("inside m2");
	}
}
class ConstructorAccessing
{
	public static void main(String []args)
	
	{
		
		Box b1;
		b1=new Box(3,4,6);
		
		System.out.println("value of w b1  is "+b1.w);
		System.out.println("value of h b1  is "+b1.h);
		System.out.println("value of d b1  is "+b1.d);
		int x=b1.volume();
		System.out.println("value of volume  is "+x);
			System.out.println("");
			b1.m1();
			b1.m2();
		
	}
}
	


