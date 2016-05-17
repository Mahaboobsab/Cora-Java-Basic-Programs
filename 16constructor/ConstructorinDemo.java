class Box
{
	int w;
	int h;
	int d;
	
	
	Box (int w)
	{
	System.out.println("Inside First constructor");
	this.w=w;	
		}
		Box(int w,int h)
		{
			this(w);
	System.out.println("Inside Second constructor");
	this.h=h;

			}
	Box(int w,int h,int d)
	{
		this(w,h);
	System.out.println("Inside Third constructor");
	this.d=d;
}


		
	}




class ConstructorinDemo
{
	public static void main(String args[])
	{
		Box b=new Box(1,2,3);
		}
	
	}
