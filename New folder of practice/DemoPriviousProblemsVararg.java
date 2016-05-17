class A
{
	void m1(int a,int b)
	{
		int z = a+b;
		System.out.println("Inside a and b"+z);
		}
		
		
		void m1(int a,int b,int c)
	{
		int z = a+b+c;
		System.out.println("Inside a and b"+z);
		}
		
		
		void m1(int a,int b,int c,int d)
	{
		int z = a+b+c+d;
		System.out.println("Inside a and b"+z);
		}
		
		
	}
	
	class B
	
	{
		void m1(int a[])
		{
			int sum = 0;

			for(int x:a)
			sum+=x;
			System.out.println("Total sum is"+sum);
			}
		}
class DemoPriviousProblemsVararg
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.m1(1,2);
		a.m1(1,2,3);
		a.m1(1,2,3,4);
		B b = new B();
		int g[] = {1,2,3,4};
		b.m1(g);

		}
	}
