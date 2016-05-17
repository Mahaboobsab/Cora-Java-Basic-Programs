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
	void m1(Animal z)//call by reference
	{
		System.out.println("Inside Hello val of z is.........."+z);
		z.sound();
		z.eat();
		}
	}


class InterfaceArgParmReturntypeDemo5
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		Animal a = null;
		a = new Cat();
		h.m1(a);
		System.out.println("Inside main val of a is.........."+a);//call by reference adv:multiple val
		System.out.println("end main..........");
		}
	}
