class Box
{
	int w;
	int h;
	int d;
	
    Box(int x, int y,int z)
    {
		w=x;
		h=y;
		d=z;
		}
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
		}
	}
class Test
{
	int p;
	int q;
	Test (int x,int y)
	{
		p=x;
		q=y;
		}
	void m1()
	{
		System.out.println("Inside test m1 method");
		}
	void m2(int a)
	{
		System.out.println("Inside m2 method");
		System.out.println("Inside m2 method val of a is"+a);
		}
	}

class Hello
{
	void m1()
	{
			System.out.println("nside Hello m1 method ");
		}
	void m2(int a)
	{
		System.out.println("Inside hellp m2 method");
		}
	
	}


class DiffDataArgAndParamDemo 
{
	public static  void main(String[] args)
	{
		Hello h=new Hello();
		h.m1();
		}
	}
