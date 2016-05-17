class A
{
	void m1()
	{
		System.out.println("Inside m1 of A");
		}
	void m2()
	{
		System.out.println("Inside m2 of A");
		}
	}



class OverrideDemo
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		a.m2();
		}
	}
