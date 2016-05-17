class Box
{
	int w;
	int h;
	int d;
	Box(int x,int  y,int z)
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
};
class NullDemo
{
	public static void main(String args[])
	{
		Box  b=null;
		System.out.println("value of b is"+" "+b);//it print null output
		b=new Box(1,2,3);
		if(b!=null){
		System.out.println("value of box w is"+" "+b);
		System.out.println("value of box w is"+" "+b.w);
	}
		System.out.println("Welcome");
		System.out.println("Go back");

		/*Test t;
		t=null;
		System.out.println("value of test t is"+" "+t);
		System.out.println("value of test t is"+" "+t.x);*/
		
			

	}
}
