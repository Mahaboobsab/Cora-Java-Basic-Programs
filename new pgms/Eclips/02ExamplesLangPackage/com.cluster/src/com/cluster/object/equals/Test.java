package com.cluster.object.equals;

//program -1
/*public class Test {
	int x;
	int y;
	public Test(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}*/
//program -2
public class Test {
	int x;
	int y;
	public Test(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	 public boolean equals (Object e)
	{
		boolean b=false;
	//	return b;
		if( e instanceof Test)
		{
			Test z;
			z=(Test)e;
		
		if(z.x == this.x && z.y== this.y)
		{
			b=true;
			return b;
		}
		else
		{
			return b;
		}
	}
		else
		{
			System.out.println("Sorry pass correct object");
			return b;
		}
	}
	
}