class  A
{
	void m1()
	{
		System.out.println("Inside method of A m1");
		}
	void fun()
	{
		System.out.println("Inside method of A fun");
		}
	}
	
	
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method of B");
		}
	void fun()
	{
		System.out.println("Inside method of B fun");
		}
	}
		
		
class C extends A
{
	void m3()
	{
	System.out.println("Inside method of C m3");
		}
	void fun()
	{
		System.out.println("Inside method of C fun");
		}
	}
	
	
	
	
class DynamicPolymorphismDemo6
{
	public static void main(String args[])
	{
		A a=new C();
		System.out.println("VAlue of A is"+a);
		B b=new B();
		System.out.println("VAlue of B is"+b);
		C c=new C();
		System.out.println("VAlue of C is"+c);
		A z=null;
		z=a;
		System.out.println("VAlue of Z A is"+z);
		z.fun();
		z=b;
		System.out.println("VAlue of Z B  is"+z);
		z.fun();
		z=c;
		System.out.println("VAlue of Z C is"+z);
		z.fun();//Z is refering which object that object get executing is called dynamic polymorpism


		}
	}
