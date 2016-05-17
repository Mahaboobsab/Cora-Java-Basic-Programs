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

class AbstractClassArgumentAndParmeterDemo2
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		Dog d = new Dog();
		h.m1(d);
		}
	}
