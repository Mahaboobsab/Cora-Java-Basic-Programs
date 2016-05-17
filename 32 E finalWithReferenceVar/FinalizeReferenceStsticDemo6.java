class Hello

{
	final static Box b;
	
	static 
	{
		b=new Box(1,2,3);
		}
	
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
class FinalizeReferenceStsticDemo6//error we can modify inside B object but not b
{
	public static void main(String args[])
	
	{
		
		System.out.println("val of b is "+Hello.b);
		Hello h1=new Hello();
		System.out.println("val of w in b is "+Hello.b.w);
		System.out.println("val of h in b is "+Hello.b.h);
		System.out.println("val of d in b is "+Hello.b.d);
		Hello.b.w=11;
		Hello.b.h=12;
		Hello.b.d=13;
		System.out.println("val of w in b is "+Hello.b.w);
		System.out.println("val of h in b is "+Hello.b.h);
		System.out.println("val of d in b is "+Hello.b.d);
		} 
		
	
	}
