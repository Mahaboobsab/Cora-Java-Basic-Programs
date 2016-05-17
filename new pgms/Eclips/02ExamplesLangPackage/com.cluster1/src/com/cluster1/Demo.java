package com.cluster1;

public class Demo {
	  public static void main(String args[]) {
	        int i,j,k;

	        for (i = 0; i < 3; i++) {

	            for(j=1; j < 4; j++) {

	                for(k=2; k<5; k++) {

	                    if((i == j)   & (j==k))

	                        System.out.println(j);

	                }                

	            }

	        }

	    }

	}



	
		/*public static void main(String args[]) {
			int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t | ((i++) == 0));
		b = (f | ((i+=2) > 0));
		System.out.println(i);	
		//System.out.println(14 ^ 23);
	}
}*/
/*class Demo
{
   static boolean check;
   public static void main(String args[])
  {
       int i;
       if(check == true)
           i=1;
       else
           i=2;
       if(i=2) i=i+2;
       else i = i + 4;
       System.out.println(i);
    }
}

*/

