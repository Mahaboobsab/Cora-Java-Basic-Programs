class Hello

{
	final static Box b;
}
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

class FinalizeReferenceStsticDemo
{
	public static void main(String args[])
	
	{
		System.out.println("value of B is"+Hello.b);
		Hello h1 = new Hello();
		System.out.println(""+h1.b);
		} 
	
	}
