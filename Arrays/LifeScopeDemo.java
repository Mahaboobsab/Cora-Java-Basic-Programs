class LifeScopeDemo
{
	public static void main(String args[])
	{
		System.out.println("Begin of maain");

		int a=1;
		System.out.println("The value of a is"+a);
		{
{
	int b=2;
			System.out.println("Inside first block");
			System.out.println("The value of a is "+a);
			System.out.println("the value of b is"+b);
int c=3;
			System.out.println("Inside first block");
			System.out.println("The value of a is "+a);
			System.out.println("the value of b is"+b);
			System.out.println("the value of b is"+c);
}
		System.out.println("the value of b is"+c);
}

	}
			  
	}
