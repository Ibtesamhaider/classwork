package basicprogram;

import java.util.Scanner;

public class Calculator {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a,int b)
	{
		return a-b;
	}
	static int mul(int a,int b)
	{
		return a*b;
	}
	static float div(int a,int b)
	{
		return (float)a/(float)b;
	}
	public static void main(String[] args) {
		do {
			System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the 1st number: ");
				int num1=sc.nextInt();
				System.out.println("enter the 2nd number: ");
				int num2=sc.nextInt();
				int sum=Calculator.add(num1, num2);
				System.out.println(sum);
				break;
			case 2:
				System.out.println("enter the 1st number: ");
				num1=sc.nextInt();
				System.out.println("enter the 2nd number: ");
				num2=sc.nextInt();
				int sub=Calculator.sub(num1, num2);
				System.out.println(sub);
				break;
			case 3:
				System.out.println("enter the 1st number: ");
				 num1=sc.nextInt();
				System.out.println("enter the 2nd number: ");
				 num2=sc.nextInt();
				int mul=Calculator.mul(num1, num2);
				System.out.println(mul);
				break;
			case 4:
				System.out.println("enter the 1st number: ");
				 num1=sc.nextInt();
				System.out.println("enter the 2nd number: ");
				 num2=sc.nextInt();
				float div=Calculator.div(num1, num2);
				System.out.println(div);
				break;
			case 5:
				System.exit(0);
			default:System.out.println("chose correct option");
			}
		}while(true);
		
		
			}
	}
