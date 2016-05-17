class Hello
{
	int [] m1(int ...a)
	{
		System.out.println("Inside varargss");
		for(int x:a)
		{
		System.out.println(x);
	}
		return a;
		
	}

}

class VarArgsDemo3
{
	public static void main(String args[])
	{
		int p=1;
		int q=2;
		int r=3;
		Hello h = new Hello();
		//h.m1(p,q,r);
		int a[]=h.m1(p,q,r);
		System.out.println("Val of  a is"+a);
		for(int y:a)
		{
		System.out.println("Val of  a is"+y);
	}
		}
	}
