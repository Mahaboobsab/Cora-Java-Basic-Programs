class Box
{
int w;
int h;
int d;
/*Box(int x,int y,int z)
{
		w=x;
		h=y;
		d=z;
}*/
Box(int x,int y,int z)
{
	w=x;
	h=y;
	d=z;
	if(w==3)
	{
	System.out.println("value of volume  is greater");
}
}
	
Box(int x,int y)
{
		w=x;
		h=y;
		d=10;
}
Box(int x)
{
		w=x;
		h=x;
		d=x;
}
Box()
{
	
	}
int volume()
{
		int l=0;
		l=w*h*d;
		return l;
}
}
class constructor2
{
	public static void main(String []args)
	
	{
		Box b2;
		b2=new Box(2,4);
		System.out.println("value of w b2  is "+b2.w);
		System.out.println("value of h b2  is "+b2.h);
		System.out.println("value of d b2  is "+b2.d);
		int x=b2.volume();
		System.out.println("value of volume  is "+x);
		
		System.out.println("");
		Box b1;
		b1=new Box(3,4,6);
		
		System.out.println("value of w b1  is "+b1.w);
		System.out.println("value of h b1  is "+b1.h);
		System.out.println("value of d b1  is "+b1.d);
		x=b1.volume();
		System.out.println("value of volume  is "+x);
			System.out.println("");
		Box b3;
		b3=new Box(4);
		int k=b3.volume();
		System.out.println(k);
		System.out.println("value of w b1  is "+b3.w);
		System.out.println("");
		Box b4;
		b4=new Box();
		System.out.println("value of adress of b4  is "+b4);
	}
}
	


