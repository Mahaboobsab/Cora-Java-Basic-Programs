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
			System.out.println("sum+++++++++++++++"+(super.x+super.y+z));


				}
		}
	
	
	
	class InHeritanceDemo3
	{
		public static void main(String args[])
		{
			A a=new A();
			a.x=11;
			a.y=2;
			a.showxy();
			
			System.out.println("val of a is++++++++++++"+a);
			B b=new B();
			b.x=5;
			b.y=6;
			b.z=7;
			b.showxy();
			b.showz();
			b.sum();
		System.out.println("val of b is++++++++++++"+b);


			}
		}
