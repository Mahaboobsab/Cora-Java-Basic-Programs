class Arithmatic
{
	private int p;
	private int q;
	
	Arithmatic(int x,int y)
	{
		p=x;
		q=y;
		}
	int add()
	{
		int r;
		r=p+q;
		return r;
		}
	int mul()
	{
		int r;
		r=p*q;
		return r;
		}
	
	int sub()
	{
		return(p-q);
		}
	int div()
	{
		int r;
		r=p/q;
		return r;
		}
	}

class ArithmaticDemo
{
	public static void main(String args[])
	{
		int a=2;
		int b=2;
		Arithmatic ar = new Arithmatic(a,b);
		int c=ar.add();
		int d=ar.mul();
		int v=ar.sub();
	    int g=ar.div();
	    
	    System.out.println("addition is"+c);
	    System.out.println("mul is"+d);
		System.out.println("div is"+g);
		System.out.println("sub is"+v);
}
}
