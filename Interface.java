package oops;
//we can not create object
interface Printable
{
	void display();
	void fun();
	}
class Print implements Printable
{

	@Override
	public void display() {
		System.out.println("display the message");
	}

	@Override
	public void fun() {
		System.out.println("fun learning");
	}
	}
class Message implements Printable
{

	@Override
	public void display() {
		System.out.println("Hello world");
		
	}

	@Override
	public void fun() {
		System.out.println("programming is fun");
		
	}
	}
public class Interface {

	public static void main(String[] args) {
		Printable p=new Print();
		p.display();
		p.fun();
		Message msg=new Message();
		msg.display();
		msg.fun();

	}

}