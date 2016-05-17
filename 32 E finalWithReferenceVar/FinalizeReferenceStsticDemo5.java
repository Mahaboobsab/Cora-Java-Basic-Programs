class Hello

{
	final static Box b;//error
	
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

class FinalizeReferenceStsticDemo5
{
	public static void main(String args[])
	
	{
		
		//Hello.b=null;//error
		
		Hello h1=new Box(5,6,7);//error
		} 
		
	
	}
