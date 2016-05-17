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
		z.eat();
		z.sound();

		}
Animal m2()
{
	Animal a = new Dog();
	System.out.println("val of a is   "+a);
	return a;

	}
}

/*class Box
{
	
	}*/

class AbstractClassArgumentAndParmeterDemo3
{
	public static void main(String args[])
	{
		Hello h = new Hello();
		Animal p = h.m2();
		System.out.println("val of p is   "+p);
		p.eat();
		p.sound();

		}
	}
