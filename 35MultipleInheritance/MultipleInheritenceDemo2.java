interface A
{
	void m1();
	void m2();
	}
interface B
{
	void m3();
	void m4();
	}
class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside class z m1 method");
		}
		public void m2()
	{
		System.out.println("Inside class z m2 method");
		}
		public void m3()
	{
		System.out.println("Inside class z m3 method");
		}
		public void m4()
	{
		System.out.println("Inside class z m4 method");
		}
		 void fun()
	{
		System.out.println("Inside class z fun method");
		}
	}
	

class MultipleInheritenceDemo2
{
	public static void main(String args[])
	{
		
		B b = null;
		Z z= null;
		z = new Z();
		b=z;
		
		//b.m1();
		//b.m2();
		
		b.m3();
		b.m4();
		b.fun();
		
		System.out.println();
		
		/*a=z;//implicit casting
		z=(Z)a;//explicit casting
		a.m1();
		a.m2();
		
		//a.m3();
		//a.m4();
		//a.fun();*/
		}
		
	}



















