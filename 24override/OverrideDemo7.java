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

class B extends A
{
	void m1()
	{
		System.out.println("Inside m1 of B");
		
		}
	void m2()
	{
		System.out.println("Inside m2 of B");
		
		}
		void m3()
	{
		System.out.println("Inside m3 of B");
		
		}
	}
		class C extends B
		{
			void m3()
			{
		System.out.println("Inside m3 of C");

				}
	void m1()
	{
		System.out.println("Inside m1 of C");
		
		}
	void m2()
	{
		System.out.println("Inside m2 of C");
		
		}
		void m4()
	{
		System.out.println("Inside m4 of C");
		
		}
		void m1(int a,int b)
		{
		System.out.println("Inside m1 ove of C");

			}
			void m1(int a)
	{
		System.out.println("Inside m1 of ove C");
		
		}
			
			
	}

class OverrideDemo7
{
	public static void main(String args[])
	{
		
		C c=new C();
		c.m1();
		//c.fun();
		c.m3();
		c.m4();
	//	c.m5();
		c.m1(10,20);
		}
	}
