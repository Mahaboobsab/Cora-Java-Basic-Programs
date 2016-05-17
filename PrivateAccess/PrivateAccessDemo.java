class Test
{
	//private int x;//error
	int x;
	}

class PrivateAccessDemo
{
	public static void main(String []args)
	
	{
		Test t1;
		t1=new Test();
		System.out.println("value of test t1  is "+t1.x);
		
		t1.x=5;

		System.out.println("value of test t1  is "+t1.x);
		System.out.println("");
		
		Test t2;
		t2=new Test();
		System.out.println("value of test t2  is "+t2.x);
		
		t2.x=15;

		System.out.println("value of test t2  is "+t2.x);
}
}
