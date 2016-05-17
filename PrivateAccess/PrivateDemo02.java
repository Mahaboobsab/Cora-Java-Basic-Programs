class Test
{
  private int x=15;
	void init (int a)
	{
		x=a;
		}
		void fun()
		{
			System.out.println("value of x is"+x);
			}
			 void m1()//make private will get error
		{
			System.out.println("inside m1");
			}
}
class PrivateDemo02
{
	public static void main(String args[])
	{
		Test t1;
		t1=new Test();
	t1.fun();
		t1.m1();
		Test t2;
		t2=new Test();
		
		t2.fun();
		t2.m1();
		
			

	}
}
