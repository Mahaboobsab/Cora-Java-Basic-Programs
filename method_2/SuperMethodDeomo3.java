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
	
	class B extends A
	{
		int z;
		B(int x,int y,int z)
		{
			super(x,y);
			this.z=z;
			
			}
		void show(int p)
		{
			System.out.println("Inside show method in class B()");
			System.out.println("Valof x and y is"+x+y);
			System.out.println("val of p is "+p);
			System.out.println("val of z is "+z);
			}
		}
	


class SuperMethodDeomo3
{
	public static void main(String args[])
	{
		/*A a = new A(10,20);
		System.out.println("val of x in main is"+a.x);
		System.out.println("val of y in main is"+a.y);
		a.showxy();*/
		
		B b = new B(5,6,7);
		System.out.println("val of x in B  ib main is"+b.x);
		System.out.println("val of y in B in main is"+b.y);
		System.out.println("val of z in B in main is"+b.z);
	//	b.show();
		b.show(5);
		}
	}
