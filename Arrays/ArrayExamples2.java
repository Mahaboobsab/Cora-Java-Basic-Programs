class ArrayExamples2
{
	public static void main(String args[])
	{
		char a[]={'A','B','C','D','E'};
		m3(a);
	    System.out.println("the value of an array is"+a);
	    System.out.println("the length of an array is"+a.length);
	         	System.out.println();
	    m2(a);
	            	System.out.println();
	    System.out.println("the value of 2 index an array is"+"  "+a[3]);
	      }
	     
			  static void m2(char x[])
			  {
			  System.out.println("the value of an array X is"+x);
	          System.out.println("the length of an array X is"+x.length);
	          System.out.println();
	    System.out.println("the value of 2 index an array is"+"  "+x[2]);
			  
			  
			  }
			   static void m3(char x[])
			  {
			  for(char i:x)
	    System.out.println("the value of 2 index an array is"+"  "+i);
			  
			  
			  }
	}
