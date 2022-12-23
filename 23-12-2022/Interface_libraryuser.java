/*create an interface LibraryUser.write 2 abstract methods registersaccount and requestbook.
 create 2 class kids user and adultuser to implements 2 abstractmethod if user is kids 
 allow them to register and issue a book of kids section and if user is adult allow 
 them register to adult section and issue them fiction type of book*/
package oops;
import java.util.*;
interface Library_user
{
	void registersaccount();
	void requestbook();
	}
class Kids_user implements Library_user//class Kids_user implementing from Library interface 
{
    //overriding the methods
	int c,s,r;
	String name;
	@Override
	public void registersaccount() {
		System.out.println("Enter your Name,\nClass,\nSection,\nRoll");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		c=sc.nextInt();
		s=sc.nextInt();
		r=sc.nextInt();
	}

	@Override
	public void requestbook() {
		System.out.println("Name:"+name+"\nClass:"+c+"\nSection:"+s+"\nRoll:"+r+"You have been issued the book no.KIDS3453");
	}
	}
class Adult_user implements Library_user
{
	int c,s;
	String name;
	@Override
	public void registersaccount() {
		System.out.println("Enter your Name,\nclass,\nroll");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		c=sc.nextInt();
		s=sc.nextInt();
		
	}

	@Override
	public void requestbook() {
		System.out.println("Name:"+name+"\nclass:"+c+"\nroll:"+s+"\nYou have been issued the book no.FICTION3453");
	}
	
	}
public class Interface_libraryuser {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age<=12) 
		{
			Library_user bk=new Kids_user();
		
			bk.registersaccount();
			bk.requestbook();
			System.out.println("Age:"+age);
			
		}
		else
		{
			Library_user nm=new Adult_user();
			nm.registersaccount();
			nm.requestbook();
			System.out.println("Age:"+age);
		}

	}

}
