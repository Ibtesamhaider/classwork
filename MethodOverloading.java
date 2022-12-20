package oops;
//compile time polymorphism
class Addition
{
	public void add(int a)
	{
		System.out.println("addition value of one parameter:"+(a+10));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("addition value of three parameters:"+(a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("addition of two parameters(int,double):"+(a+b));
	}
	public void add(double a,int b)
	{
		System.out.println("addition of two parameters(double,int):"+(a+b));
	}
	}
public class MethodOverloading {
public static void main(String args[])
{
	Addition ad=new Addition();
	ad.add(12,45,10);
	ad.add(100);
	ad.add(12.3,5);
	ad.add(56,50.8);
	}
}
	