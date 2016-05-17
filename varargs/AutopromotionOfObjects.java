class Hello
{
	void m1(int a)
	{
		System.out.println("value of a is"+a);
		}
	}
class AutopromotionOfObjects
{
	public static void main(String[] args)
	{
		int a=10;
		byte b=10;
		short s=10;
		long l=10;
		Hello h = new Hello();
		h.m1(a);
		h.m1(b);
		h.m1(s);
		//h.m1(l);big to smallnot possible
		}
	}
