class Box
{
	int w;
	int h;
	int d;
	static int count;
	Box(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
		count++;
		}
		Box(int w,int h)
		{
			this.w=w;
			this.h=h;
			d=10;
			count++;
			}
			Box(int x)
			{
				w=d=h=x;
				count++;
				}
	}
	class ToCountNoOfObjects
	{
		public static void main(String args[])
		{
			Box b1=new Box(1,2,3);
			Box b2=new Box(1,2);
			Box b3=new Box(1);
			System.out.println(Box.count);

 			}
		}
