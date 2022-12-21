package oops;
class Animal//grand parent class
{
	public void display()
	{
		System.out.println("Animal");
	}
	}
class Dog extends Animal//parent class
{
	public void dog()
	{
		System.out.println("dog is barking");
	}
	}
class Puppy extends Dog//child class
{
	public void puppy()
	{
		System.out.println("child of dog");
	}
	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Puppy py=new Puppy();
		py.display();
		py.dog();
		py.puppy();

	}

}
