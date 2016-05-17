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
public void finalize()
{
	System.out.println("Inside finalize method");
	}

}
class InstanceBLockDemo1
{
	public static void main(String args[])
	{
		Hello h1=null;
		h1=new Hello();
		h1.m1();
		h1.m1();h1.m1();
		h1.m1();//I can call n times of this method
		Hello h2=null;;
		h2=new Hello();
		h1.m1();
		h1.m1();
		h2.m1();
		h1=null;
		System.gc();
		}
	}
