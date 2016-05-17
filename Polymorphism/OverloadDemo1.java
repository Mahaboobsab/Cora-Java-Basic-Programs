class Hello
 {
	 void test()
	 {
		 System.out.println("No parameter");
	 }
	  void test(int a)
	 {
		 System.out.println("The value of int a is"+a);
	 }
	  void test(int a,double d)
	 {
		 System.out.println("the value of int a and double d is"+a+" "+d);
	 }
	  void test(double d,int a)
	 {
		 System.out.println("the value of double d and int a is"+d+" "+a);
	 }
	  void test (double d)
	 {
		 System.out.println("The value of double d is "+d);
	 }
	
		 
 };
 class OverloadDemo1
 {
	 public static void main(String args[])
	 {
		  
		Hello h=new Hello();
		 h.test();
		 h.test(5.6,9);
		 h.test(8,8.8);
		 h.test(5);
		 h.test(6.0);
		
	 }
 }
	 
