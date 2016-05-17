abstract class Animal
{
	void eat()
	{
		System.out.println("Dig is eating");
		}
	abstract void sound();
	}
	
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dig is Barking");
		}
	}

class Lion extends Animal
{
	void sound()
	{
		System.out.println("Lion is roaring");

		}
	}

class Hello
{
	void m1(Animal z)
	{
		System.out.println("val of z is   "+z);
		//z.null;
		z.eat();
		z.sound();

		}
	}

class Box
{
	
	}

class AbstractClassArgumentAndParmeterDemo
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		//Box b=null;
		//Animal a = new Animal();
		Animal a = new Dog();
		h.m1(a);
		}
	}
