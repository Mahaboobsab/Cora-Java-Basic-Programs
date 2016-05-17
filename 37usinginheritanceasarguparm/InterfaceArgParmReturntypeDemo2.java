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
		z.sound();
		z.eat();
		}
	}


class InterfaceArgParmReturntypeDemo2
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		Animal a = null;
		a = new Dog();
		h.m1(a);
		System.out.println("end main..........");
		}
	}
