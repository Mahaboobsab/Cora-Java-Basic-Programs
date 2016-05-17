interface A
{
	 void m1();
	 void m2();
}
class B implements A
{
	public void m1()//compulsury public and override
	{
		System.out.println("Inside m1");
		}
	public void m2()
	{
		System.out.println("Inside 2");
		}
	}
	
class interface Demo5
{
	public static void main(String args[])
	{
		A a = null;
		B b= null;
		b = new B();
		b.m1();
		b.m2();
		a=b;
		a.m1();
		a.m2();
		}
	}
