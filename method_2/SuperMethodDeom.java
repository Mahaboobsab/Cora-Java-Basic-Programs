class A
{
	int x,y;
	A(int x,int y)
	{
		this.x=x;
		this.y=y;
		}
	void showxy()
	{
		System.out.println("Inside showxy method");
		System.out.println("Inside showxy method val of x and y is"+x+y);
		System.out.println("Inside showxy method val using this of x and y is"+this.x+this.y);
		}
	}


class SuperMethodDeom
{
	public static void main(String args[])
	{
		A a = new A(10,20);
		System.out.println("val of x in main is"+a.x);
		System.out.println("val of y in main is"+a.y);
		a.showxy();
		}
	}
