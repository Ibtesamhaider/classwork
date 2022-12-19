package inheritance;

 class Riya{
	public void s_class()//parent class method 
	{
    System.out.println("i am parent class method");
	}
}
class Child extends Riya
{
	public void childclassMethod()
	{
		System.out.println("i am child class method");
	}
	}
public class InheritanceDemo
{
	public static void main(String args[])
	{
		Child ch=new Child();
		ch.s_class();
		ch.childclassMethod();
	}
	}