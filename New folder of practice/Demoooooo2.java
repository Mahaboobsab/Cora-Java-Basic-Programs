



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
}
class Demoooooo2
{
	public static void main()
	{
		Hello h=new Hello();
		int p=1;
		int q=2;
		int r=3;
		int s=4;
		h.m1(p,q,r,s);
	}
}
