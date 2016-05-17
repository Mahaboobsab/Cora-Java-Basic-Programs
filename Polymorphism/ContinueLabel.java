class Hello
 {

	void test()
	{
		System.out.println("No parameter");
}
void test(int a)
	{
		System.out.println("Value of int a is"+a);
}
void test(int a,double d)
	{
		System.out.println("Value of int a and double d is"+a+d);
}
void test(double d,int a)
	{
		System.out.println("Value of double d and int a is"+d+a);
}
void test(double d)
	{
		System.out.println("the valu of double is"+d);
}
}
class OverloadDemo
{
public static void main(String args[]) 
{
	Hello h;
	h=new Hello();
	h.test();
	h.test(5,9.2);
	h.test(7.8,2);
	h.test(5.6);
}
}
