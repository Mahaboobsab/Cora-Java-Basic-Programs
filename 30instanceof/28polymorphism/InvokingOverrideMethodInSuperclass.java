class A
{
	void m1()
	{
		System.out.println("Inside A m1 method");
		}
		void fun()
	{
		System.out.println("Inside fun A method");
		}
	}



class InvokingOverrideMethodInSuperclass
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		}
	}
