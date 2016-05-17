class ParameterAddMulDemo5
{
	public static void main(String []args)
	{
		System.out.println("Begin of main()");
		System.out.println("end of main()");
		int z=m2(15);
		System.out.println("Val of z is"+z);
	}
	/*void m1()
	{
		System.out.println("Entering m1()");

		System.out.println("Inside m1()");

		System.out.println("End m1()");
		return;		
		}*/
		static int m2(int a)
		{
		System.out.println("Entering m2()");
		if(a<10)
		{
		System.out.println("value is less than 0");
		return a;
	}
		
			else
			{
			
				System.out.println("value is greater than 10()");
			}
	return a;
}
/*
int m3(int a)
int p=0;
if(a>0 && a<10)
{
	System.out.println("value of a bet 0 and 10");
	p=1;
	return p;
}
else if(a>10 && a<20)

System.out.println("value of a bet 10 and 20");
p=2;
return p;

else
{
	System.out.println("value outside the range");
	return p;

	}*/
}
		
		
