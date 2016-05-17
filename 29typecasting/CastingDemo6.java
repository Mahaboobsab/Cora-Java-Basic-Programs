class A
{
	int x,y;
	A(int x,int y)
	{
		this.x=x;
		this.y=y;
		}
		
	void m1()
	{
		System.out.println("inside m1 A method");
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
void m2()
	{
		System.out.println("inside m2 B method");
		}
		
	}



class CastingDemo6
{
	public static void main(String args[])
	{
		B b = new B(5,6,7); 
			A a=null;
			a=b;
		System.out.println("val of A is"+a);
		System.out.println("val of x in A is"+a.x);
		System.out.println("val of y in A is"+a.y);
		a=(A)b;
		
	}
}
