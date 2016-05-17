class A
{
	int x;
	int y;
	void showxy()
	{
		System.out.println("val of x and y is"+x+y);
		
		}
	}
	
	class B extends A
	{
		int z;
		void showz()
		{
			System.out.println("val of z is"+z);
			}
			void sum()
			{
						
			System.out.println("sum of x,y and z  is"+(x+y+z));

				}
		}
	
	
	
	class InHeritanceDemo2
	{
		public static void main(String args[])
		{
			A a=new A();
			a.x=1;
			a.y=2;
			a.showxy();
			
			System.out.println("val of a is++++++++++++"+a);
			B b=new B();
			System.out.println("val of x b is++++++++++++"+b.x);
			b.x=5;
			b.y=6;
			b.z=7;
			b.showxy();
			b.showz();
			b.sum();
			System.out.println("val of a is++++++++++++"+a.x);
		System.out.println("val of b is++++++++++++"+b);


			}
		}
