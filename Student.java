package demo;

public class Student {
	int roll;
	String s_name;
	long ph;
	int age;
	Student(int id,String name)
	{
		roll=id;
		s_name=name;
	}
	void display()
	{
		System.out.println("roll: "+roll+"\t"+"name: "+s_name);
	}
	public class ParameterizeConstructor{
		public static void main(String[] args)
		{
			Student ibtesam=new Student(101,"ibtesam");
			ibtesam.display();
			Student mangaldip=new Student(102,"mangaldip");
			mangaldip.display();
		}
	}	
	}
