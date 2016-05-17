abstract class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	
abstract void m2();
abstract void m3();

}

abstract class B extends A
{
	
	void m2()
	{
		System.out.println("Inside B m2");
		}
		
	
	void fun()
	{
		System.out.println("Inside B fun");
		}
abstract void m3();//optional
	}
 
class C extends B
{
	
	void m3()
	{
		System.out.println("Inside C m3");
		}
void test()
	{
		System.out.println("Inside C test");
		}		
	}
		
class ManyAbstractMethodDemo7
{
	public static void main(String args[])
	{
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.fun();
		c.test();
		
		}
	}
