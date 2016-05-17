abstract class A
{
	void m1()
	{
		System.out.println("Inside A m1");
		}
	
abstract void m2();
abstract void m3();

}

 class B extends A
{
	
	void m2()
	{
		System.out.println("Inside B m2");
		}
 void m3()
	{
		System.out.println("Inside B m3");
		}
 
	
	void fun()
	{
		System.out.println("Inside B fun");
		}
//abstract void m3();//optional
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
		
class ManyAbstractMethodDemo9
{
	public static void main(String args[])
	{
		A a = null;
		B b = null;
		C c = new C();
		a=c;
		
		
		}
	}
