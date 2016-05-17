interface A
{
	 void m1();
	 void m2();
	 void m3();
	 
}
class B implements A
{
	public void m1()//compulsury public and override
	{
		System.out.println("Inside B m1");
		}
	public void m2()
	{
		System.out.println("Inside m2");
		}
	public void m3()
	{
		System.out.println("Inside m3");
		}
	void fun()
	 {
		System.out.println("Inside b fun...");
		}
	}
class C extends B
{
	public void m3()
	{
		System.out.println("Inside C m3");
		}
  void test()
	{
		System.out.println("Inside C test...");
		}
	}
	
class interfaceDemo8
{
	public static void main(String args[])
	{
		A a = null;
		B b= null;
		C c=null;
		c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.test();
		c.fun();
		
		}
	}
