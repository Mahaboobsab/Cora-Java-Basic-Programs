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
			this(w);//Error Because it should start first
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




class ConstructorinDemo2
{
	public static void main(String args[])
	{
		Box b1=new Box(1);
	System.out.println("The value of b1 is"+b1);				
	System.out.println("The value of w in b1 is"+b1.w);
	System.out.println("The value of h in b1 is"+b1.h);			
	System.out.println("The value of d in b1 is"+b1.d);



		}
	
	}
