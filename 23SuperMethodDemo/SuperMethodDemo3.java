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
		System.out.println("Inside showxy() method of A");
		System.out.println("val of x and y is"+x+y);
		System.out.println("val of x and y is"+this.x+this.y);
		}
	}
class B extends A
{
	int z;
	B(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
		}
		
		
		
		void show()
	{
		System.out.println("Inside show() method of B");
		System.out.println("val of x and y is"+x+y);
		System.out.println("val of z in B is"+z);
		}
	}


class SuperMethodDemo3
{
	public static void main(String args[])
	{
		/*A a= new A(10,20);
		System.out.println("val of x A in main is"+a.x);
		System.out.println("val of y  A in main is"+a.y);
		a.showxy();*/
		B b=new B(5,6,7);
		System.out.println("val of x in B main is"+b.x);
		System.out.println("val of y in B main is"+b.y);
		System.out.println("val of z in B main is"+b.z);
		b.showxy();

		}
	}
