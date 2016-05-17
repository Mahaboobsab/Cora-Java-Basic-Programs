class ArgumentsAndParameterDemo
{
	public static void main(String args[])
	{
		System.out.println("Begin of main");
		int a=10;
		int b=50;
		int c=5;
		int d=0;
		d=m1(a,b,c);

	}
	static int m1(int x,int y,int z)
	{
		System.out.println("Begin of m1");
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		System.out.println("value of z is"+z);
		
		x*=2;
		y/=2;
		z-=2;
		System.out.println("value of x after change is"+x);
		System.out.println("value of y after change is"+y);
		System.out.println("value of z after change is"+z);
        
		System.out.println("End of m1");
		return z;
}


}



		


		
