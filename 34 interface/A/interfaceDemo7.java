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
	protected void m2()
	{
		System.out.println("Inside m2");
		}
	void m3()
	 {
		System.out.println("Inside m3");
		}
	}
	
class interfaceDemo7
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
		//a.m3();
		b.m3();
		}
	}
