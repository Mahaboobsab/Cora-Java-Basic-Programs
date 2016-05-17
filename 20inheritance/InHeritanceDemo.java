class A
{
	int x;
	int y;
	void showxy()
	{
		System.out.println("val of x and y is"+x+y);
		
		}
	}
	class InHeritanceDemo
	{
		public static void main(String args[])
		{
			A a=new A();
			a.x=1;
			a.y=2;
			a.showxy();
			}
		}
