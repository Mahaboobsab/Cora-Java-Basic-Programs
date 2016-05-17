class ParameterAddMulDemo
{
	public static void main(String []args)
	{
		int a=5;
		int b=15;
		double c=0;
		c=add(a,b);
		System.out.println("Sum of a,b is"+c);
		int p=5;
		int q=3;
		int r;
		r=multiply(p,q);
		System.out.println("Sum of p,q is"+r);
	
}
	
	
		static double add(int x,int y)
		{
			int z=0;
			z=x+y;
			return z;
			}
		static int multiply(int x,int y)
		{
			int z=0;
			z=x*y;
			return z;
		}

		

}
