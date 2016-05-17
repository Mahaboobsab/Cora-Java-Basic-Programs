interface A
{
	 void m1();
	 void m2();
	 void m3();
	 
}
abstract class B implements A//Here I am not overriding m3() so abstract
{
	public void m1()//compulsury public and override
	{
		System.out.println("Inside B m1");
		}
	public void m2()
	{
		System.out.println("Inside B m2");
		}
	
	public void fun()
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
	
class interfaceDemo10
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
		b=c;
		b.m1();
		b.m2();
		b.m3();
		b.fun();
		//h.test();
		a=c;
		a.m1();
		a.m2();
		a.m3();
		//a.fun();
		//a.test();
		//A a1=new A();
		//B b1=new B();
		
		}
	}
