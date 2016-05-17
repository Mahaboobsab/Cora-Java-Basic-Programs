interface A
{
	 void m1();
	 void m2();
	 void m3();
	 
}
class B implements A//Here I am not overriding m3() so abstract
{
	public void m1()//compulsury public and override
	{
		System.out.println("Inside B m1");
		}
	public void m2()
	{
		System.out.println("Inside B m2");
		}
	public void m3()
	 {
		//I am cheating compliler because I have to override m3()
		}
		
	public void fun()
	 {
		System.out.println("Inside b fun...");
		}
	
	}

	
class interfaceDemo11
{
	public static void main(String args[])
	{
	
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.fun();
		
		}
	}
