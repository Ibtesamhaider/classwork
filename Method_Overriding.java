package oops;
class ParentBank
{
	public void LoanInterest()
	{
		System.out.println("9% interest");
	}
	}
class Childsbi extends ParentBank
{
	public void LoanInterest()
	{
		System.out.println("7.5% interest");
	}
	}
class ChildAxis extends ParentBank
{
	public void LoanInterest()
	{
		System.out.println("7% interest");
	}
	}
class ChildHdfc extends ParentBank
{
	public void LoanInterest()
	{
		System.out.println("12% interest");
	}
	}
public class Method_Overriding {
	public static void main(String[] args) {
		//Childsbi sbi=new Childsbi();
		//sbi.LoanInterest();
		//ChildHdfc hdfc=new ChildHdfc();
		//hdfc.LoanInterest();
		ParentBank pb;
		pb=new Childsbi();//upcasting
		pb.LoanInterest();
		pb=new ChildHdfc();
		pb.LoanInterest();
		pb=new ChildAxis();
		pb.LoanInterest();
	}
}
