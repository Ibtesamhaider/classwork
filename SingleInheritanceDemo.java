package oops;
class User{
	int id;
	String name;
	String address;
	public User(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("id: "+id+"\n"+"name: "+name+"\n"+"address:"+address);
	}
}
class Employeee extends User
{
	double salary;
	String designation;
	public Employeee(int id,String name,String address,double salary,String designation)
	{
		super(id,name,address);
		this.salary=salary;
		this.designation=designation;
	}
	public void getData()
	{
		super.display();
		System.out.println("salary:"+salary);
		System.out.println("designatiom:"+designation);
	}
}
public class SingleInheritanceDemo
{
	public static void main(String args[])
	{
		Employeee emp1=new Employeee(101,"ibtesam","kolkata",30000,"SE");
		emp1.getData();
	}
	}
