class Hello
{
	void m1()
	{
		System.out.println("Inside m1");
		
		}
		void m2()
	{
		this.m1();
		System.out.println("Inside m2");
		this.m1();
		}

		
	}




class thisMethodDemo2
{
	public static void main(String args[])
	{
		Hello h=new Hello();
		h.m1();
		h.m2();


		}
	
	}
