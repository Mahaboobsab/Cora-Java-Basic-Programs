class Test
{
private int x=5;
	void init (int a)
	{
		x=a;
		}
		void fun()
		{
			System.out.println("value of x is"+x);
			}
}
class PrivateDemo2
{
	public static void main(String args[])
	{
		Test t1;
		t1=new Test();
		t1.init(44);
		t1.fun();
		

	}
}
