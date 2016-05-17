class ArrayExamples
{
	public static void main(String args[])
	{
		int a[];
		a=new int[5];
		a[0]=1;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<=a.length;i++)
	System.out.println("The value of an A array a is"+i);
    System.out.println("The value of an A in 2 index array  is"+a[2]);

	
					System.out.println();

	int x[]=a;
			for(int i=0;i<=x.length;i++)


    System.out.println("The value of an X array  is"+i);
    System.out.println("The value of an xin 2 index array  is"+x[2]);

    
	int p=x[2];
	int q=a[2];
	System.out.println("The value of an p in 2 index array  is"+p);

    System.out.println("The value of an q in 2 index array  is"+q);


		}
	}
