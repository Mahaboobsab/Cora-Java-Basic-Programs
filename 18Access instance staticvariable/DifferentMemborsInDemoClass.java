class DifferentMemborsInDemoClass
{
	static int a=5;
	static int b;
	
	static
	{
		System.out.println("Inside static block");
		System.out.println("Inside static block"+a);
		System.out.println("Inside static block"+b);
		b=a*2;
		System.out.println("Inside static block"+a);
		System.out.println("Inside static block"+b);
		}
		static void m1(int x)
		{
			System.out.println("Inside static m1");
			System.out.println("value of a is"+a);
			System.out.println("value of b is"+b);
			System.out.println("value of x is"+x);
		}
			public static void main(String args[])
			{
				m1(55);
				}
			}
