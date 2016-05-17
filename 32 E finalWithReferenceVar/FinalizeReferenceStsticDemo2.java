class Hello

{
	//final static Box b;//error
	final static Box b = new Box(1,2,3);
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

class FinalizeReferenceStsticDemo2
{
	public static void main(String args[])
	
	{
		
		System.out.println("value of B is"+Hello.b);
		System.out.println("value of B is"+Hello.b.w);
		System.out.println("value of B is"+Hello.b.volume());
		} 
	
	}
