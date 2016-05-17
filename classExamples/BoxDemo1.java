class Box
{
	int w=5;
	int h=6;
	int d=7;

	}
	
class BoxDemo1
{
	public static void main(String args[])
	{
		Box b;
		b=new Box();
		System.out.println("value  of Box b is"+" "+b);
		System.out.println("value  of wieth w is"+" "+b.w);
		System.out.println("value  of height w is"+" "+b.h);
		System.out.println("value  of dimention w is"+b.d);

		System.out.println("");

		int vol1=b.w*b.h*b.d;
		
		System.out.println("The volume of Box is"+vol1);
		
		Box b1;
		b1= new Box();
		System.out.println("value  of Box b1 is"+" "+b1);
		System.out.println("value  of wieth w is"+" "+b1.w);
		System.out.println("value  of height w is"+" "+b1.h);
		System.out.println("value  of dimention w is"+b1.d);
		System.out.println("");
		System.out.println("");

		int vol2=b1.w*b1.h*b1.d;
		System.out.println("The volume of Box is"+vol2);
				
		Box b2;
		b2=new Box();
        System.out.println("value  of Box b1 is"+" "+b2);
		System.out.println("value  of wieth w is"+" "+b2.w);
		System.out.println("value  of height w is"+" "+b2.h);
		System.out.println("value  of dimention w is"+b2.d);
		
		b.w=1;
		b.h=2;
		b.d=3;
		System.out.println("");
        System.out.println("value  of Box b1 is"+" "+b);
		System.out.println("value  of wieth w is"+" "+b.w);
		System.out.println("value  of height w is"+" "+b.h);
		System.out.println("value  of dimention w is"+b.d);
		 System.out.println("");
	    b.w=11;
		b.h=22;
		b.d=33;
		System.out.println("");
        System.out.println("value  of Box b1 is"+" "+b);
		System.out.println("value  of wieth w is"+" "+b.w);
		System.out.println("value  of height w is"+" "+b.h);
		System.out.println("value  of dimention w is"+b.d);
			 System.out.println("");
			 
	Box k;
	k= new Box();
	System.out.println("value  of Box k is"+" "+k);
		System.out.println("value  of wieth d is"+" "+k.w);
		System.out.println("value  of height d is"+" "+k.h);
		System.out.println("value  of dimention d is"+k.d);
			 System.out.println("");
	
	
	
	
	
	
	}
	
	
	
}
