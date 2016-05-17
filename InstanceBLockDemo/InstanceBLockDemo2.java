class Hello
{
{
System.out.println("Inside instance block");
}
Hello ()
{
	System.out.println("Inside constructor block");
}
void m1()
{
		System.out.println("Inside m1 method");
}

}
class InstanceBLockDemo2
{
	public static void main(String args[])
	{
		Hello h1=null;
		h1=new Hello();
		h1.m1();
		h1.m1();h1.m1();
		h1.m1();
		}
	}
