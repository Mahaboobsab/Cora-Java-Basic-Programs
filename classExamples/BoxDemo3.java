	class Box
	{
		int w=5;
		int d=6;
		int t=8;
		
		}
	
	class BoxDemo3
{
	public static void main(String args[])
	{
		Box b;
		b= new Box();
		System.out.println("the value of b is"+" "+b);
		int s=b.w*b.t;
		System.out.println("the value of width and trace is is"+" "+s);
		System.out.println("");
		int m=b.d*b.w;
		System.out.println("the value of m is"+" "+m);

	System.out.println("");
  Box b2;
  b2=new Box();
  int c=b2.w*b2.t;
  System.out.println("the value of b is"+" "+c);	
	b2.w=22;
	b2.t=15;
	int u=b2.w*b2.t;
  System.out.println("the value of v is"+" "+u);			
	
	
		
	
	}
}
