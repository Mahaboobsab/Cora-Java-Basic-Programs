class Hello
{
void m1 (int ...a)
{
System.out.println("Inside of m1");
for (int x:a)
{
System.out.println("value of a is"+x);
}
}


void m2(double d,int ...a)
{
	System.out.println("Inside double and andd int");
	}
	
void m3(boolean b,double d,int ...a)
{
	System.out.println("Inside booblean double and andd int");
	}
	
void m4(int a)
{
	System.out.println("Inside normal method");
	
	}
}
class VarArgsDemo2
{
	public static void main(String args[])
	{
		Hello h=new Hello();
		short p=1;
		short q=2;
		short r=3;
		short s=4;
		double d =5.5;
		h.m1(p,q,r,s);
		h.m4(p,q,r,s);
		
		h.m2(d,p,q,r);
		
		h.m3(true,6.6,p,r,s);
		
		
		
	}
}
