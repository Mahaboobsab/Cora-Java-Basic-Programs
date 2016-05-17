interface Animal
{
	void sound();
	void eat();
	}
class Lion implements Animal
{
	public void sound()
	{
		System.out.println("Lion is roaring.....");
		}
	public void eat()
	{
		System.out.println("Lion is eating.....");
		}
	}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("Dog is barking.....");
		}
	public void eat()
	{
		System.out.println("Dog is eating.....");
		}
	}
class Cat implements Animal
{
	public void sound()
	{
		System.out.println("Cat says miyawwwwww......");
		}
	public void eat()
	{
		System.out.println("Cat is eating.....");
		}
	}
	

class Hello
{
	void m1(Animal z)
	{
		System.out.println("Begin Hello..........");
		System.out.println("Inside Hello val of z is.........."+z);
		if (z instanceof Lion)
		{
			System.out.println("Begin of Lion");
			Lion l=(Lion)z;
			l.sound();
			l.eat();
			}
			
			else if (z instanceof Dog)
		{
			System.out.println("Begin of Dog");
			Dog d=(Dog)z;
			d.sound();
			d.eat();
			}
			
			else if (z instanceof Cat)
		{
			System.out.println("Begin of Cat");
			Cat c=(Cat)z;
			c.sound();
			c.eat();
			}
			else
			{
				System.out.println("not matching.....");
				}
			
			System.out.println("End of Hello.....");
		}
	}


class InterfaceArgParmReturntypeDemo7
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		/*Animal a = null;
		a = new Lion();
		
		System.out.println("Inside main val of a is.........."+a);
		h.m1(a);
		System.out.println("end main..........");*/
		
		
		Animal b = null;
		
		
		System.out.println("Inside main val of a is.........."+b);
		h.m1(b);
		System.out.println("end main..........");
		
		}
	}
